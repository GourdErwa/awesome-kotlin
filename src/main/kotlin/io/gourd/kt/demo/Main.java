package io.gourd.kt.demo;

/**
 * @author Li.Wei by 2021/1/21
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        log("log demo...");
    }

    public static void log(String s) {
        logImpl(s);
    }

    private static void logImpl(String message) {
        System.out.println(message);
    }
}
