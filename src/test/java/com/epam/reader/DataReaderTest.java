package com.epam.reader;

import com.epam.exception.CustomReaderException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {
    DataReader reader=new DataReader();

    @Test
    public void testTetrahedronReader() throws CustomReaderException {
        List<String> expected=reader.tetrahedronReader("data//point.txt");
        List<String> actual=new ArrayList<>();
        actual.add("1 1 1 0 2 5 3 -1 4 4 2 1");
        actual.add("1 1 1 2 4 7 -1 2 3 -3 2 1");
        Assert.assertEquals(actual,expected);
    }

}
