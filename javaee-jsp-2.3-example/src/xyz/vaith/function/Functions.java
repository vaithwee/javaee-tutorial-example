package xyz.vaith.function;

public class Functions {
    public static String reverse(String text) {
        return new StringBuffer(text).reverse().toString();
    }

    public static int count(String text) {
        return text.length();
    }
}
