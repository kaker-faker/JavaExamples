package com.example.helloworld;

public class Chapter1Problem4 {
    public static void main(String[] args) {

        // 1.4
        // Write a method to replace all spaces in a string with '%20'.
        // You may assume that the string has sufficient space at the end of the string to hold
        // to hold the additional characters, and that you are given the "true" length of the string.
        // (Note: if implementing in Java, please use a character array so that you can perform this
        // operation in place.)
        // eg. "Mr John Smith     ", 13 returns "Mr%20John%20Smith"

        System.out.println("Write a method to replace all spaces in a string with '%20'.");
        String str = "Mr John Smith     ";
        int length = 13;
        System.out.println("'Mr John Smith     ', 13 : " + replaceSpace(str, length));
        System.out.println("'Mr John Smith     ', 13 : " + replaceSpace2(str, length));
    }

    public static String replaceSpace(String str1, int length) {

        char[] char1 = str1.toCharArray();
        for (int i = 0; i < char1.length; i++) {
            if (i == length) {
                break;
            }
            if (char1[i] == ' ') {
                char1[i] = '%';
                for (int j = char1.length - 1; j > i; j--) {
                    char1[j] = char1[j - 2];
                }
                char1[i + 1] = '2';
                char1[i + 2] = '0';
                length += 2;
            }
        }
        return String.valueOf(char1).trim();
    }

    public static String replaceSpace2(String str1, int length) {
        int newLength = length;
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == ' ') {
                newLength += 2;
            }
        }
        char[] char1 = new char[newLength];
        for (int i = 0, j = 0; i < length; i++, j++) {
            if (str1.charAt(i) == ' ') {
                char1[j++] = '%';
                char1[j++] = '2';
                char1[j] = '0';
            } else {
                char1[j] = str1.charAt(i);
            }
        }
        return String.valueOf(char1);
    }
}
