package com.epam.lessons.lesson9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBooksMethods {
    Books books;

    @Before
    public void setUp() {
        initializeBooks();
    }

    @Test
    public void testFindBooksByAuthor() {
        int expectedLength = 1;
        Books bookByAuthor = books.findBooksByAuthor("Bradbury");
        Assert.assertEquals(expectedLength, bookByAuthor.getLength());
    }

    @Test
    public void testFindBooksByYear() {
        int expectedLength = 3;
        Books bookByYear = books.findBookByYear(1970);
        Assert.assertEquals(expectedLength, bookByYear.getLength());
    }

    @Test
    public void testSortByPrice() {
        books.sortByPrice();
        Book[] bookArray = books.getBookArray();
        Assert.assertEquals(120, bookArray[0].getPrice(), 0);
        Assert.assertEquals(140, bookArray[1].getPrice(), 0);
        Assert.assertEquals(200, bookArray[2].getPrice(), 0);
        Assert.assertEquals(220, bookArray[3].getPrice(), 0);
        Assert.assertEquals(300, bookArray[4].getPrice(), 0);
        Assert.assertEquals(320, bookArray[5].getPrice(), 0);
        Assert.assertEquals(520, bookArray[6].getPrice(), 0);
    }

    @Test
    public void testSortByAuthor() {
        books.sortByAuthor();
        Book[] bookArray = books.getBookArray();
        Assert.assertEquals("Bradbury", bookArray[0].getAuthor());
        Assert.assertEquals("Dickens", bookArray[1].getAuthor());
        Assert.assertEquals("Fitzgerald", bookArray[2].getAuthor());
        Assert.assertEquals("Flaubert", bookArray[3].getAuthor());
        Assert.assertEquals("Homer", bookArray[4].getAuthor());
        Assert.assertEquals("Melville", bookArray[5].getAuthor());
        Assert.assertEquals("Orwel", bookArray[6].getAuthor());
    }

    @Test
    public void testSortByPublishHouse() {
        books.sortByPublishHouse();
        Book[] bookArray = books.getBookArray();
        Assert.assertEquals("Fly", bookArray[0].getPublishHouse());
        Assert.assertEquals("Mega", bookArray[1].getPublishHouse());
        Assert.assertEquals("New", bookArray[2].getPublishHouse());
        Assert.assertEquals("OldPublish", bookArray[3].getPublishHouse());
        Assert.assertEquals("SunnyPublish", bookArray[4].getPublishHouse());
        Assert.assertEquals("True", bookArray[5].getPublishHouse());
        Assert.assertEquals("www", bookArray[6].getPublishHouse());
    }

    private void initializeBooks() {
        Book[] books = {
                new Book(1, "Fahrenheit 451", "Bradbury", "SunnyPublish", 1953, 112, 120),
                new Book(2, "1984", "Orwel", "Fly", 1930, 412, 200),
                new Book(3, "The Great Gatsby", "Fitzgerald", "OldPublish", 1921, 332, 140),
                new Book(4, " Moby Dick", "Melville", "Mega", 1988, 625, 300),
                new Book(5, " The Odyssey", "Homer", "New", 1978, 876, 520),
                new Book(6, " Madame Bovary", "Flaubert", "True", 1976, 327, 320),
                new Book(7, " Great Expectations", "Dickens", "www", 1966, 411, 220)
        };
        this.books = new Books(books);
    }
}
