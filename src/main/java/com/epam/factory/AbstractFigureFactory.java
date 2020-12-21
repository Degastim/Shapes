package com.epam.factory;

import com.epam.model.entity.AbstractFigure;
import com.epam.model.entity.Point;

import java.util.List;

public abstract class AbstractFigureFactory<T extends AbstractFigure> {
    public abstract T createInstance(String name, List<Point> pointList);
}
