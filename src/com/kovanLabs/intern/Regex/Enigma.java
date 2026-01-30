package com.kovanLabs.intern.Regex;
public class Enigma {
    public String encrypt(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(chars[i] ^ key);
        }
        return new String(chars);
    }
    public String decrypt(String cipher, int key) {
        char[] chars = cipher.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(chars[i] ^ key);
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Enigma enigma = new Enigma();
        String message = "HelloWorld";
        int key = 123;
        String cipher = enigma.encrypt(message, key);
        System.out.println("Encrypted: " + cipher);
        String decrypted = enigma.decrypt(cipher, key);
        System.out.println("Decrypted: " + decrypted);
        if (message.equals(decrypted)) {
            System.out.println("Success! Decrypted message matches original.");
        } else {
            System.out.println("Oops! Something went wrong.");
        }
    }
}
