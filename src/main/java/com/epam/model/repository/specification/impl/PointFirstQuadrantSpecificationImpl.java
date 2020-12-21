package com.epam.model.repository.specification.impl;

import com.epam.model.entity.Point;
import com.epam.model.entity.Tetrahedron;
import com.epam.model.repository.specification.Specification;

import java.util.ArrayList;
import java.util.List;

public class PointFirstQuadrantSpecificationImpl implements Specification {
    private List<Point> pointList;

    public PointFirstQuadrantSpecificationImpl(List<Point> pointList) {
        this.pointList = new ArrayList<>(pointList);
    }

    @Override
    public boolean specify(Tetrahedron tetrahedron) {
        boolean result = true;
        for (Point i : pointList) {
            if (i.getX() < 0 || i.getY() < 0 || i.getZ() < 0)
                result = false;
        }
        return result;
    }
}
