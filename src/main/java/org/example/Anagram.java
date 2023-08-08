package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk kelimeyi giriniz : ");
        String word1 = scanner.nextLine().trim();

        System.out.println("İkinci kelimeyi giriniz : ");
        String word2 = scanner.nextLine().trim();

        System.out.println("Sonuc :" + checkAnagram(word1,word2));

    }

    public static boolean checkAnagram(String word1,String word2){
        // kelimelerin uzunlukları aynı değilse direkt olarak false dönüyor
        if(word1.length() != word2.length()) return false;

        Map<Character,Integer> charCount = new HashMap<>();
        for(char w : word1.toCharArray()) charCount.put(w,charCount.getOrDefault(w,0) +1);
        for(char c : word2.toCharArray()) charCount.put(c , charCount.getOrDefault(c,0)-1);
        return charCount.values().stream().allMatch(value -> value == 0);
    }
}
