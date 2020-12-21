package com.epam.validator;

import com.epam.model.entity.Point;
import com.epam.model.entity.Tetrahedron;

import java.util.List;

public class TetrahedronValidator {
    public static boolean tetrahedronStringValidation(String stringData) {
        String[] rawData = stringData.split(" ");
        double[][] data = new double[4][3];

        if (rawData.length > 12) {
            return false;
        }
        try {
            int counter = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = Integer.parseInt(rawData[counter++]);
                }
            }
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            return false;
        }
        double x1 = data[0][0];
        double y1 = data[0][1];
        double z1 = data[0][2];
        double x2 = data[1][0];
        double y2 = data[1][1];
        double z2 = data[1][2];
        double edgeLength = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
        double newEdgeLength;
        boolean result = true;
        for (double[] i : data) {
            x1 = i[0];
            y1 = i[1];
            z1 = i[2];
            for (double[] j : data) {
                x2 = j[0];
                y2 = j[1];
                z2 = j[2];
                newEdgeLength = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
                if (edgeLength != newEdgeLength) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static boolean tetrahedronValidation(Tetrahedron tetrahedron) {
        List<Point> pointList = tetrahedron.getPointList();
        boolean result = true;
        double x1 = pointList.get(0).getX();
        double y1 = pointList.get(0).getY();
        double z1 = pointList.get(0).getZ();
        double x2 = pointList.get(1).getX();
        double y2 = pointList.get(1).getY();
        double z2 = pointList.get(1).getZ();
        double edgeLength = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
        double newEdgeLength;
        for (Point i : pointList) {
            for (Point j : pointList) {
                x1 = i.getX();
                y1 = i.getY();
                z1 = i.getZ();
                x2 = j.getX();
                y2 = j.getY();
                z2 = j.getZ();
                newEdgeLength = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
                if (edgeLength != newEdgeLength) {
                    result = false;
                }
            }

        }
        return result;
    }
}
