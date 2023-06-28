package org.example;

import java.util.Scanner;

import static org.example.AnagramService.isAnagramMultiset;
import static org.example.AnagramService.isAnagramSort;
import static org.example.AnagramService.prepareString;

public class Main {
    public static void main(String[] args) {
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter first String: ");
        String text1 = input.nextLine();
        System.out.print("Enter second String: ");
        String text2 = input.nextLine();

        // closing scanner
        input.close();

        // lowercase both texts and then checking for anagram
        if (isAnagramMultiset(prepareString(text1), prepareString(text2))) {
            System.out.println("Texts are anagrams (checked with isAnagramMultiset)");
        } else {
            System.out.println("Texts are not anagrams (checked with isAnagramMultiset)");
        }

        // lowercase both texts and then checking for anagram
        if (isAnagramSort(prepareString(text1), prepareString(text2))) {
            System.out.println("Texts are anagrams (checked with isAnagramSort)");
        } else {
            System.out.println("Texts are not anagrams (checked with isAnagramSort)");
        }
    }
}