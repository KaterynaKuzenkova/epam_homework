package com.epam.lessons.lesson10;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAndReadFile {
    public static void readFile() {
        FileInputStream fis = null;
        int a = 0;

        try {
            fis = new FileInputStream("test.txt");
            fis.read();
            while ((a = fis.read()) != -1) {
                System.out.println((char) a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveFile(String toSave) {
        FileWriter fr = null;
        try {
            fr = new FileWriter("test.txt", true);
            fr.write(toSave);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
