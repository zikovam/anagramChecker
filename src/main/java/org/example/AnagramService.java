package org.example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Arrays;

public class AnagramService {

    private AnagramService() {
    }

    public static boolean isAnagramMultiset(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        Multiset<Character> multiset1 = HashMultiset.create();
        Multiset<Character> multiset2 = HashMultiset.create();
        for (int i = 0; i < text1.length(); i++) {
            multiset1.add(text1.charAt(i));
            multiset2.add(text2.charAt(i));
        }
        return multiset1.equals(multiset2);
    }

    public static boolean isAnagramSort(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        char[] text1CharArray = text1.toCharArray();
        char[] text2CharArray = text2.toCharArray();
        Arrays.sort(text1CharArray);
        Arrays.sort(text2CharArray);
        return Arrays.equals(text1CharArray, text2CharArray);
    }

    public static String prepareString(String text) {
        return text.toLowerCase();
    }
}
