package com.epam.lessons.lesson8.comparator;

import com.epam.lessons.lesson8.Book;

import java.util.Comparator;

public class BookPublishHouseComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublishHouse().compareTo(o2.getPublishHouse());
    }
}
