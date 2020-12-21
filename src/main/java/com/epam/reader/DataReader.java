package com.epam.reader;

import com.epam.exception.CustomReaderException;
import com.epam.validator.FileValidator;
import com.epam.validator.TetrahedronValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader {
    private final static Logger logger = LogManager.getLogger();
    private static final String DEFAULT_PATH = "src\\java\\resources\\data\\point.txt";

    public List<String> tetrahedronReader(String fileName) throws CustomReaderException {
        Path path = FileValidator.fileValidation(fileName) ? Path.of(fileName) : Path.of(DEFAULT_PATH);
        List<String> list;

        try (Stream<String> lineStream = Files.lines(path)) {
            list = lineStream.filter(TetrahedronValidator::tetrahedronStringValidation).collect(Collectors.toList());
        } catch (IOException e) {
            logger.log(Level.ERROR, "Can't read from file", e);
            throw new CustomReaderException();
        }
        return list;
    }
}
