package com.kovanLabs.intern.Regex;

public class TextScrubber {
    public static void main(String[] args) {
        String input = "H3ll0 W0rld! Th1s is J4v4.";
        String step1 = input.replaceAll("\\d", "*");
        String result = step1.replaceAll("[\\p{Punct}]", "");
        System.out.println("Original Text : " + input);
        System.out.println("Scrubbed Text : " + result);

    }
}