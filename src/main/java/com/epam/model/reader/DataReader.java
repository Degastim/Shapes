package com.epam.model.reader;

import com.epam.model.validator.TetrahedronValidator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    public void tetrahedronReader(String fileName) throws IOException {
        Path path = Path.of(fileName);
        List<String[]> list = Files.lines(path).filter(TetrahedronValidator::tetrahedronStringValidation).map(value->value.split(" ")).collect(Collectors.toList());
        List<Integer[]> result=new ArrayList<>();
        for(String[] i:list){
            Integer[] data=new Integer[]
            for(int j=0;j<i.length;j++){
                result.add(Integer.parseInt(i[j]));
            }
        }
    }
}
