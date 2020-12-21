package com.epam.validator;

import java.io.File;

public class FileValidator {
    public static boolean fileValidation(String fileName) {
        boolean result = (new File(fileName)).exists();
        return result;
    }
}