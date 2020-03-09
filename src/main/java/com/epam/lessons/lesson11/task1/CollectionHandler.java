package com.epam.lessons.lesson11.task1;

import java.util.List;
import java.util.Set;

public class CollectionHandler {
    public void createCollectionAndPrint() {
        CreateCollection createCollection = new CreateCollection();
        List<Integer> listIntegers = createCollection.createArrayList(20, 1, 100);
        Set<Integer> setIntegers = createCollection.createSet(20, 1, 100);

        int i = 0;
        System.out.println("Print array list generated elements");
        for (Integer element : listIntegers) {
            System.out.println("element[" + i + "]: " + element);
            i++;
        }

        i = 0;
        System.out.println("Print set generated elements");
        for (Integer element : setIntegers) {
            System.out.println("element[ " + i + "]: " + element);
            i++;
        }
    }
}
