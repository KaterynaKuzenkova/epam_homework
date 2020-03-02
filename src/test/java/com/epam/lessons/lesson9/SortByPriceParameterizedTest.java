package com.epam.lessons.lesson9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class SortByPriceParameterizedTest {
    int year;
    int expectedLength;
    Books books;

    @Before
    public void setUp() {
        initializeBooks();
    }

    public SortByPriceParameterizedTest(int year, int expectedLength) {
        this.expectedLength = expectedLength;
        this.year = year;
    }

    @Parameterized.Parameters(name = "expectedResultsData")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {1920, 7},
                {1929, 6},
                {1952, 5},
                {1965, 4},
                {1975, 3},
                {1977, 2},
                {1987, 1}
        });
    }

    @Test
    public void paramTest() {
        Books bookByYear = books.findBookByYear(year);
        Assert.assertEquals(expectedLength, bookByYear.getLength());
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

