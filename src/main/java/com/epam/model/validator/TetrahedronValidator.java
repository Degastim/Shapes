package com.epam.model.validator;

public class TetrahedronValidator {
    public static boolean tetrahedronStringValidation(String stringData) {
        String[] rawData = stringData.split(" ");
        if (rawData.length > 12) {
            return false;
        }
        double[][] data = new double[4][3];
        try {
            int counter = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = Integer.parseInt(rawData[counter++]);
                }
            }
        } catch (NumberFormatException e) {
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
                if (edgeLength != newEdgeLength) result = false;
            }
        }
        return result;
    }
}
