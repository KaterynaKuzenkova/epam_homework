package com.epam.lessons.lesson11.task2;

public class Translator {

    private Dictionary dictionary;

    public Translator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(String stringToTranslate) {
        String translatedString = "";
        String[] words = stringToTranslate.split(" ");
        for (String word : words) {
            translatedString += dictionary.getTranslation(word) + " ";
        }
        return translatedString;
    }
}
