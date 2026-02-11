package com.kovanLabs.intern.cryptography;
public class Enigma {
    private String xorTransform(String input, int key) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ key);
        }
        return new String(chars);
    }
    public String encrypt(String message, int key) {
        return xorTransform(message, key);
    }
    public String decrypt(String cipher, int key) {
        return xorTransform(cipher, key);
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
