package com.epam.lessons.lesson6;

import java.util.Arrays;

public class Books {
    private Book[] books;
    private int filled = 0;

    public Books(int length) {
        this.books = new Book[length];
    }

    public Book[] getBooks() {
        return books;
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
            book.view();
        }
    }

    public void changePrice(double increasePercents) {
        for (Book book : books) {
            double newPrice = (book.getPrice() * increasePercents / 100) + book.getPrice();
            book.setPrice(newPrice);
        }
    }

    public Books findBooksByAuthor(String authorName) {
        Books booksList = new Books(0);

        for (Book book : books) {
            if (authorName.equalsIgnoreCase(book.getAuthor())) {
                booksList.addBook(book);
            }
        }

        if (booksList.getBooks().length == 0) {
            System.out.println("Books are not found");
        }

        return booksList;
    }

    public Books findBookByYear(int yearOfPublication) {
        Books booksList = new Books(0);

        for (Book book : books) {
            if (yearOfPublication < book.getYearOfPublication()) {
                booksList.addBook(book);
            }
        }
        if (booksList.getBooks().length == 0) {
            System.out.println("Books are not found");
        }
        return booksList;
    }

}
