package com.epam.lessons.lesson11.task1;

import java.util.*;

public class CreateCollection {

    public List<Integer> createArrayList(int n, int from, int to) {
        if ((to - from) + 1 < n) {
            throw new RuntimeException("Incorrect range, range less then number to generate");
        }

        List<Integer> arrayList = new ArrayList<>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt((to - from) + 1) + from;
            arrayList.add(randomNumber);
        }

        return arrayList;
    }

    public Set<Integer> createSet(int n, int from, int to) {
        if ((to - from) + 1 < n) {
            throw new RuntimeException("Incorrect range, range less then number to generate");
        }

        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt((to - from) + 1) + from;
            set.add(randomNumber);
        }
        return set;
    }
}
