package com.example.helloworld;

import java.util.Arrays;

public class Chapter1Problem2 {

    public static void main(String[] args) {

        System.out.println("Given a list of characters, return a reversed list");
        char[] test = {'t', 'e', 's', 't'};
        char[] another = {'a', 'n', 'o', 't', 'h', 'e', 'r'};
        System.out.println("{'t', 'e', 's', 't'}: " + Arrays.toString(reverseIt(test)));
        System.out.println("{'a', 'n', 'o', 't', 'h', 'e', 'r'}: " + Arrays.toString(reverseIt(another)));

    }

    // 1.2
    // Implement a function void reverse(char* str) in C or C++ which reverses a null terminated string.
    // This is Java so I'll just reverse it
    public static char[] reverseIt(char[] charReversed) {

        for (int i = 0 ; i < charReversed.length / 2 ; i++) {
            char tmp = charReversed[i];
            charReversed[i] = charReversed[charReversed.length - i - 1];
            charReversed[charReversed.length - i - 1] = tmp;
        }

        return charReversed;
    }
}
