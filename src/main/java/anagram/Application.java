package main.java.anagram;

import anagram.StringReverser;

public class Application {
    private static String lettersOnly = " ";
    private static String notLettersOnly = "a1bcd efg!h";

    public static void main(String[] args) {

        System.out.println("Reversing strings with letters only demo: ");
        System.out.println("Before:     " + lettersOnly);
        System.out.println("After:      " + StringReverser.reverseStrings(lettersOnly));

        System.out.println();

        System.out.println("Reversing strings with not letters only demo: ");
        System.out.println("Before:     " + notLettersOnly);
        System.out.println("After:      " + StringReverser.reverseStrings(notLettersOnly));
    }
}
