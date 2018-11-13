package com.example.helloworld;

import java.util.Arrays;

public class Chapter1Problem3 {
    public static void main(String[] args) {

        // 1.3
        // Given two strings, write a method to determine if one is a permutation of the other.

        System.out.println("Given two strings, are they permutations of each other");
        String perm1a = "test";
        String perm1b = "sett";
        String perm2 = "set";
        System.out.println("test and sett: " + isPermutation(perm1a, perm1b));
        System.out.println("test and set: " + isPermutation(perm1a, perm2));
    }

    public static boolean isPermutation(String str1, String str2) {

        String[] strArray = {str1, str2};
        char[] char1 = str1.toCharArray();
        Arrays.sort(char1);
        char[] char2 = str2.toCharArray();
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }
}
