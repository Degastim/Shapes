package com.epam.model.service.impl;

import com.epam.model.entity.Point;
import com.epam.model.entity.Tetrahedron;
import com.epam.model.service.TetrahedronService;

import java.util.List;

public class TetrahedronServiceImpl implements TetrahedronService {
    @Override
    public double calculatePerimeter(Tetrahedron tetrahedron) {
        List<Point> pointList = tetrahedron.getPointList();
        double result = 0;
        for (Point i : pointList) {
            for (Point j : pointList) {
                double x1 = i.getX();
                double y1 = i.getY();
                double z1 = i.getZ();
                double x2 = j.getX();
                double y2 = j.getY();
                double z2 = j.getZ();
                result += Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
            }
        }
        return result / 2;
    }

    @Override
    public double calculateVolume(Tetrahedron tetrahedron) {
        List<Point> pointList = tetrahedron.getPointList();
        double result = 0;
        double[] ab = new double[3];
        double[] ac = new double[3];
        double[] ad = new double[3];
        Point pointA = pointList.get(0);
        Point pointB = pointList.get(1);
        Point pointC = pointList.get(2);
        Point pointD = pointList.get(3);
        ab[0] = pointB.getX() - pointA.getX();
        ab[1] = pointB.getY() - pointA.getY();
        ab[2] = pointB.getZ() - pointA.getZ();

        ac[0] = pointC.getX() - pointA.getX();
        ac[1] = pointC.getY() - pointA.getY();
        ac[2] = pointC.getZ() - pointA.getZ();

        ad[0] = pointD.getX() - pointA.getX();
        ad[1] = pointD.getY() - pointA.getY();
        ad[2] = pointD.getZ() - pointA.getZ();
        result += ab[0] * ac[1] * ad[2] + ab[1] * ac[2] * ad[0] + ab[2] * ac[1] * ad[1] - ab[2] * ac[1] * ad[0] - ab[1] * ac[0] * ad[2] - ab[0] * ac[2] * ad[1];
        return result;
    }
}
