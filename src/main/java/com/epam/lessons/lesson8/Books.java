package com.epam.lessons.lesson8;

import com.epam.lessons.lesson8.comparator.BookAuthorComparator;
import com.epam.lessons.lesson8.comparator.BookPriceComparator;
import com.epam.lessons.lesson8.comparator.BookPublishHouseComparator;

import java.util.Arrays;

import static com.epam.lessons.lesson8.Validator.validateEmptyString;
import static com.epam.lessons.lesson8.Validator.validateNaturalNumber;

public class Books {
    private Book[] books;
    private int filled = 0;

    public Books(int length) {
        this.books = new Book[length];
    }

    public Books(Book[] books) {
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
        validateNaturalNumber(increasePercents);
        for (Book book : books) {
            double newPrice = (book.getPrice() * increasePercents / 100) + book.getPrice();
            book.setPrice(newPrice);
        }
    }

    public Books findBooksByAuthor(String authorName) {
        validateEmptyString(authorName);
        Books booksList = new Books(0);

        for (Book book : books) {
            if (authorName.equalsIgnoreCase(book.getAuthor())) {
                booksList.addBook(book);
            }
        }

        return booksList;
    }

    public Books findBookByYear(int yearOfPublication) {
        validateNaturalNumber(yearOfPublication);
        Books booksList = new Books(0);

        for (Book book : books) {
            if (yearOfPublication < book.getYearOfPublication()) {
                booksList.addBook(book);
            }
        }

        return booksList;
    }

    public void sortByPrice() {
        Arrays.sort(this.books, new BookPriceComparator());
    }

    public void sortByAuthor() {
        Arrays.sort(this.books, new BookAuthorComparator());
    }

    public void sortByPublishHouse() {
        Arrays.sort(this.books, new BookPublishHouseComparator());
    }
}
