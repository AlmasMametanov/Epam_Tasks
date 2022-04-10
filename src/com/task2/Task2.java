package com.task2;

import java.util.Arrays;

public class Task2 {
    // Количество цифр в строке
    public static int numberOfDigitsInString(String str) {
        int numberOfDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                numberOfDigits++;
            }
        }
        return numberOfDigits;
    }

    // Частота встречаемости символа в строке
    public static int frequencyOfCharacter(String str, char character) {
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                frequency++;
            }
        }
        return frequency;
    }

    // Переворот строки
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // Вывести слова строки в обратном порядке
    public static String reverseSubstring(String str) {
        String reverse = "";
        String[] substringArray = str.split(" ");
        for (int i = substringArray.length - 1; i >= 0; i--) {
            reverse = reverse + substringArray[i] + " ";
        }
        return reverse;
    }

    // Определить длину самого короткого слова в строке
    public static int lengthOfShortestWord(String str) {
        String[] substringArray = str.split(" ");
        int substringLength = Integer.MAX_VALUE;
        for (int i = 0; i < substringArray.length; i++) {
            if (substringArray[i].length() < substringLength) {
                substringLength = substringArray[i].length();
            }
        }
        return substringLength;
    }

    // Подсчет количества слов в строке
    public static int numberOfWords(String str) {
        String[] substringArray = str.split(" ");
        return substringArray.length;
    }

    // Является ли строка палиндромом
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                break;
            }
            if (i == str.length() / 2 - 1) {
                return true;
            }
        }
        return false;
    }

    // Четные и нечетные символы разделить по разным строкам
    public static String evenAndOddCharsSplitInStrings(String str, String oddOrEven) {
        StringBuilder oddChars = new StringBuilder();
        StringBuilder evenChars = new StringBuilder();
        if (oddOrEven.equals("odd")) {
            for (int i = 0; i < str.length(); i += 2) {
                oddChars.append(str.charAt(i));
            }
            return oddChars.toString();
        } else {
            for (int i = 1; i < str.length(); i += 2) {
                evenChars.append(str.charAt(i));
            }
            return evenChars.toString();
        }
    }

    // Вводится строка из букв и цифр, построить новую только из цифр
    public static String buildStringFromNumbers(String str) {
        StringBuilder numbersFromString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                numbersFromString.append(str.charAt(i));
            }
        }
        return numbersFromString.toString();
    }

    // Количество вхождений подстроки в строку
    public static int countOccurrencesOfSubstring(String str, String substring) {
        int index = 0;
        int count = 0;
        while ((index = str.indexOf(substring, index)) != -1) {
            index++;
            count++;
        }
        return count;
    }

    // Сортировка массива строк по алфавиту
    public static String sortArrayOfStringsAlphabetically(String str) {
        String[] arrayOfStrings = str.split(" ");
        Arrays.sort(arrayOfStrings);
        return Arrays.toString(arrayOfStrings);
    }

    // Добавление пробелов в строку
    // Добавляю пробелы перед заглавными буквами
    public static String addingSpacesToString(String str) {
        StringBuilder stringWithSpaces = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                stringWithSpaces.append(" ");
            }
            stringWithSpaces.append(str.charAt(i));
        }
        return stringWithSpaces.toString();
    }

    // Замена подстроки в строке
    public static String replaceSubstringInString(String str, String substring, String newSubstring) {
        return str.replace(substring, newSubstring);
    }

    // Удаление одинаковых символов
    public static String deletionOfIdenticalCharacters(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            while (stringBuilder.indexOf(String.valueOf(stringBuilder.charAt(i)), i + 1) != -1) {
                stringBuilder.deleteCharAt(stringBuilder.indexOf(String.valueOf(stringBuilder.charAt(i)), i + 1));
            }
        }
        return stringBuilder.toString();
    }

    // Расстояние между подстроками
    public static int distanceBetweenSubstrings(String str, String substring1, String substring2) {
        String[] arrayOfSubstrings = str.split(" ");
        int distance = 0;
        for (int i = 0; i < arrayOfSubstrings.length; i++) {
            if (arrayOfSubstrings[i].equals(substring1)) {
                for (int j = 0; j < arrayOfSubstrings.length; j++) {
                    if (arrayOfSubstrings[j].equals(substring2)) {
                        distance = Math.abs(i - j) - 1;
                        return distance;
                    }
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        String str = "askldjAdnqKF12NDK abc cvvxlask345 blre67k8 def dElknn99rS";
        String substring = "ask";
        String newSubstring = "LKJH";
        String palindrome = "swasaws";
        char symbol = 'a';

        System.out.println("Number of digits in a string: " + numberOfDigitsInString(str));
        System.out.println("Frequency of character in a string: " + frequencyOfCharacter(str, symbol));
        System.out.println("Reverse string: " + reverseString(str));
        System.out.println("Reverse substrings: " + reverseSubstring(str));
        System.out.println("Determine the length of the shortest word in a string: " + lengthOfShortestWord(str));
        System.out.println("Counting the number of words in a string: " + numberOfWords(str));
        System.out.println("Is the string a palindrome: " + isPalindrome(palindrome));
        System.out.println("Even and odd characters split in different strings: odd = " +
                evenAndOddCharsSplitInStrings(str, "odd") + " , even = " +
                evenAndOddCharsSplitInStrings(str, "even"));
        System.out.println("Enter string of letters and numbers, to build a new one only from numbers: " + buildStringFromNumbers(str));
        System.out.println("Count of occurrences of a substring in a string: " + countOccurrencesOfSubstring(str, substring));
        System.out.println("Sort array of strings alphabetically: " + sortArrayOfStringsAlphabetically(str));
        System.out.println("Adding spaces in a string: " + addingSpacesToString(str));
        System.out.println("Replacing a substring in a string: " + replaceSubstringInString(str, substring, newSubstring));
        System.out.println("Deletion of identical characters: " + deletionOfIdenticalCharacters(str));
        System.out.println("Distance between substrings: " + distanceBetweenSubstrings(str, "abc", "def"));
    }
}
