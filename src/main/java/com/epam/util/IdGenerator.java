package com.epam.util;

public class IdGenerator {
    private static long currentId;

    public static long getCurrentId() {
        return currentId++;
    }
}
