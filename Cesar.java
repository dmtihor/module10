package com.dmtihor.homework2;

public class Cesar {
    public static String crypt(String s, int x) {
        if (s.isEmpty())
            throw new RuntimeException("Text is empty");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + x);
        }
        return new String(chars);
    }

}
