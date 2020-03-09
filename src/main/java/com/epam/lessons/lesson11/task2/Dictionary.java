package com.epam.lessons.lesson11.task2;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary = new HashMap<>();

    public void addToDictionary(String key, String value) {
        dictionary.put(key, value);
    }

    public String getTranslation(String word) {

        return dictionary.getOrDefault(word, word);
    }
}
