package com.epam.parser;

import com.epam.model.entity.Point;

import java.util.ArrayList;
import java.util.List;

public class TetrahedronParser {

    public List<Point> pointParsing(String rawData) {
        String[] data = rawData.split(" ");
        List<Point> result = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            Point point = new Point();
            point.setX(Double.parseDouble(data[counter++]));
            point.setY(Double.parseDouble(data[counter++]));
            point.setZ(Double.parseDouble(data[counter++]));
            result.add(point);
        }
        return result;
    }
}
