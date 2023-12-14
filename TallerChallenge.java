/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tallerchallenge;

/**
 *
 * @author neves
 */
public class TallerChallenge {

    private static boolean isPalindrome(String word) {
        int j = word.length() - 1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    private static String biggestPalindrome(String word) {
        String currentStr = word.substring(0, 1);
        int currentLen = 1;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + currentLen; j < word.length(); j++) {
                String currentSubstring = word.substring(i, j);
                if (j - i > currentLen && isPalindrome(currentSubstring)) {
                    currentLen = j - i;
                    currentStr = currentSubstring;
                }
            }
        }
        return currentStr;
    }

    public static void main(String[] args) {
        String input = "abac";
        String input2 = "tacag";
        String input3 = "wegeeksskeegyuwe";
        System.out.println("currentStr: " + biggestPalindrome(input));
        System.out.println("currentStr: " + biggestPalindrome(input2));
        System.out.println("currentStr: " + biggestPalindrome(input3));

    }
}
