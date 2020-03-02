package com.epam.lessons.lesson9;

import javax.xml.bind.ValidationException;
import java.util.Arrays;
import java.util.Comparator;

import static com.epam.lessons.lesson9.Validator.validateEmptyString;
import static com.epam.lessons.lesson9.Validator.validateNaturalNumber;

public class Books {
    private Book[] books;
    private int filled = 0;

    public Books(int length) {
        this.books = new Book[length];
    }

    public Books(final Book[] books) {
        this.books = books;
    }

    public int getLength() {
        return filled;
    }

    public void addBook(Book book) {
        if (filled >= books.length) {
            books = Arrays.copyOf(books, books.length + 1);
        }
        books[filled] = book;
        filled++;
    }

    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void changePrice(double increasePercents) {
        try {
            validateNaturalNumber(increasePercents);
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        for (Book book : books) {
            double newPrice = (book.getPrice() * increasePercents / 100) + book.getPrice();
            book.setPrice(newPrice);
        }
    }

    public Books findBooksByAuthor(String authorName) {
        try {
            validateEmptyString(authorName);
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        Books booksList = new Books(0);

        for (Book book : books) {
            if (authorName.equalsIgnoreCase(book.getAuthor())) {
                booksList.addBook(book);
            }
        }

        return booksList;
    }

    public Books findBookByYear(int yearOfPublication) {
        try {
            validateNaturalNumber(yearOfPublication);
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        Books booksList = new Books(0);

        for (Book book : books) {
            if (yearOfPublication < book.getYearOfPublication()) {
                booksList.addBook(book);
            }
        }

        return booksList;
    }

    public void sortByPrice() {
        Arrays.sort(this.books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
    }

    public void sortByAuthor() {
        Arrays.sort(this.books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
    }

    public void sortByPublishHouse() {
        Arrays.sort(this.books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishHouse().compareTo(o2.getPublishHouse());
            }
        });
    }

    public Book[] getBookArray() {
        return books;
    }

}
