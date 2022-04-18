package com.task3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "/c:/Users/Ideronn/Desktop/Java_EPAM_Training/Epam_Tasks/src/com/task3/inputFile.txt/";
        String outputFileName = "/c:/Users/Ideronn/Desktop/Java_EPAM_Training/Epam_Tasks/src/com/task3/outputFile.txt/";
        StringBuilder text = new StringBuilder();
        int c;
        try {
            FileReader inputStream = new FileReader(inputFileName);
            FileWriter outputStream = new FileWriter(outputFileName);
            while ((c = inputStream.read()) != -1) {
                text.append((char) c);
            }
            System.out.println("Counting the number of words in a string: " + numberOfWords(text.toString()));
            System.out.println("Determine the length of the shortest word in a string: " + lengthOfShortestWord(text.toString()));
            outputStream.write(text.toString());
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Подсчет количества слов в строке
    public static int numberOfWords(String str) {
        String[] substringArray = str.split(" |\n");
        return substringArray.length;
    }

    // Определить длину самого короткого слова в строке
    public static int lengthOfShortestWord(String str) {
        String[] substringArray = str.split(" |\n");
        int substringLength = Integer.MAX_VALUE;
        for (int i = 0; i < substringArray.length; i++) {
            if (substringArray[i].length() < substringLength) {
                substringLength = substringArray[i].length();
            }
        }
        return substringLength;
    }
}
