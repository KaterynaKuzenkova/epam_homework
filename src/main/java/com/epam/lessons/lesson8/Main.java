package com.epam.lessons.lesson8;

import java.util.Scanner;

import static com.epam.lessons.lesson8.Validator.validateDoubleNumber;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books(5);

        Book[] booksList = new Book[]{
                new Book(1, "Fahrenheit 451", "Bradbury", "SunnyPublish", 1953, 112, 120),
                new Book(2, "1984", "Orwel", "SunnyPublish", 1930, 412, 200),
                new Book(3, "The Great Gatsby", "Fitzgerald", "OldPublish", 1921, 332, 140),
                new Book(4, " Moby Dick", "Melville", "OldPublish", 1988, 625, 300),
                new Book(5, " The Odyssey", "Homer", "OldPublish", 1978, 876, 520),
                new Book(6, " Madame Bovary", "Flaubert", "MegaPublish", 1976, 327, 320),
                new Book(7, " Great Expectations", "Dickens", "MegaPublish", 1966, 411, 220)

        };

        for (Book book : booksList) {
            books.addBook(book);
        }

        books.viewBooks();

        try {
            System.out.println("Enter increase of the price in percent for the books ");
            String priceCoefficient = scanner.nextLine();
            validateDoubleNumber(priceCoefficient);
            books.changePrice(Double.parseDouble(priceCoefficient));
            books.viewBooks();
        } catch (ValidationException e) {
            System.out.println("Change price failed due to " + e.getMessage());
        }

        try {
            System.out.println("Enter author's name");
            String author = scanner.nextLine();
            Books booksByAuthor = books.findBooksByAuthor(author);

            if (booksByAuthor.getLength() > 0) {
                System.out.println("Found books:");
                booksByAuthor.viewBooks();
            } else {
                System.out.println("Books not found");
            }
        } catch (ValidationException e) {
            System.out.println("Find book by author failed due to " + e.getMessage());
        }

        try {
            System.out.println("Enter the year of the publishing ");
            Books booksByYear = books.findBookByYear(scanner.nextInt());

            if (booksByYear.getLength() > 0) {
                System.out.println("Found books:");
                booksByYear.viewBooks();
            } else {
                System.out.println("Books not found");
            }
        } catch (ValidationException e) {
            System.out.println("Find book by year failed due to " + e.getMessage());
        }
        System.out.println("------------------------------Sorting by Price----------------------------");
        books.sortByPrice();
        books.viewBooks();
        System.out.println("------------------------------Sorting by Author---------------------------");
        books.sortByAuthor();
        books.viewBooks();
        System.out.println("----------------------------Sorting by Publish House------------------------");
        books.sortByPublishHouse();
        books.viewBooks();
    }
}


