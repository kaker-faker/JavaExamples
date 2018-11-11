package com.example.helloworld;

import java.util.HashSet;

public class Chapter1Problem1 {

    public static void main(String[] args) {

        // 1.1
        // Implement an algorithm to determine if a string has all unique characters.
        // What if you cannot use additional data structures?
        // example 1 with additional data structures

        System.out.println("Does string have duplicate characters?");
        // With
        System.out.println("Tes: " + hasDupLetters("tes"));
        System.out.println("Test: " + hasDupLetters("test"));
        // Without
        System.out.println("Tes: " + hasDupLetters2("tes"));
        System.out.println("Test: " + hasDupLetters2("test"));
    }

    public static boolean hasDupLetters(String myStr) {

        // loop through string
        HashSet<Character> charList = new HashSet<>();
        for (char charCheck : myStr.toCharArray()) {
            if (charList.contains(charCheck)) {
                return true;
            } else {
                charList.add(charCheck);
            }

        }
        return false;
    }

    //Example 2 without
    public static boolean hasDupLetters2(String myStr) {

        // loop through string
        for (String charCheck : myStr.split("")) {
            if (myStr.indexOf(charCheck) != myStr.lastIndexOf(charCheck)) {
                return true;
            }
        }
        return false;
    }
}
