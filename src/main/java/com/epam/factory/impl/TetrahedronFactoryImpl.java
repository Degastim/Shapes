package com.epam.factory.impl;

import com.epam.factory.AbstractFigureFactory;
import com.epam.model.entity.Point;
import com.epam.model.entity.Tetrahedron;

import java.util.List;

public class TetrahedronFactoryImpl extends AbstractFigureFactory<Tetrahedron> {
    @Override
    public Tetrahedron createInstance(String name, List<Point> pointList) {
        Tetrahedron tetrahedron = new Tetrahedron();
        tetrahedron.setTetrahedronName(name);
        tetrahedron.setPointList(pointList);
        return tetrahedron;
    }
}
