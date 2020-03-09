package com.epam.lessons.lesson11;

import com.epam.lessons.lesson11.task1.CollectionHandler;
import com.epam.lessons.lesson11.task2.Dictionary;
import com.epam.lessons.lesson11.task2.Translator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CollectionHandler collectionHandler = new CollectionHandler();
        collectionHandler.createCollectionAndPrint();

        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Input the pair of words to the dictionary: ");
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            dictionary.addToDictionary(words[0], words[1]);
        }

        Translator translator = new Translator(dictionary);
        System.out.println("Input the phrase to translate: ");
        String toTranslate = scanner.nextLine();
        String translated = translator.translate(toTranslate);
        System.out.println(translated);
    }
}
