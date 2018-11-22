package com.example.helloworld;

public class Chapter1Problem5 {
    public static void main(String[] args) {

        // 1.5
        // Implement a method to perform basic string compression using the counts of repeated characters.
        // For example, the string aabcccccaaa would become a2b1c5a3.
        // If the "compressed" string would not become smaller than the original string,
        // your method should return the original string.
        // You can assume the string has only upper and lower case letters (a - z)

        System.out.println("Write a method to perform basic string compression using the counts of repeated characters.");
        String str1 = "aabcccccaaa";
        String str2 = "abcaa";
        System.out.println("aabcccccaaa : " + compressString(str1));
        System.out.println("abcaa : " + compressString(str2));
    }

    public static String compressString(String str1) {

        StringBuilder str2 = new StringBuilder();
        str2.append(str1.charAt(0));
        int charCount = 1;

        for (int i = 1; i < str1.length(); i++) {
            if (str1.charAt(i) == str1.charAt(i - 1)) {
                charCount++;
            } else {
                str2.append(charCount);
                str2.append(str1.charAt(i));
                charCount = 1;

            }
        }
        str2.append(charCount);

        return str1.length() <= str2.length() ? str1 : str2.toString();
    }
}
