package com.epam.parser;

import com.epam.exception.CustomReaderException;
import com.epam.model.entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TetrahedronParserTest {
    Point point1 = new Point(1, 1, 1);
    Point point2 = new Point(0, 2, 5);
    Point point3 = new Point(3, -1, 4);
    Point point4 = new Point(4, 2, 1);

    @Test
    public void testPointParsing() throws CustomReaderException {
        TetrahedronParser parser = new TetrahedronParser();
        List<Point> actual = parser.pointParsing("1 1 1 0 2 5 3 -1 4 4 2 1");
        List<Point> expected = new ArrayList<>();
        expected.add(point1);
        expected.add(point2);
        expected.add(point3);
        expected.add(point4);
        Assert.assertEquals(actual, expected);
    }
}
