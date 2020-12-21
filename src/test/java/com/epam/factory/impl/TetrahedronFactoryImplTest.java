package com.epam.factory.impl;

import com.epam.model.entity.Point;
import com.epam.model.entity.Tetrahedron;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TetrahedronFactoryImplTest {
    TetrahedronFactoryImpl factory = new TetrahedronFactoryImpl();
    Point point1 = new Point(1, 1, 1);
    Point point2 = new Point(2, 4, 7);
    Point point3 = new Point(-1, 2, 3);
    Point point4 = new Point(-3, 2, 1);
    List<Point> list = new ArrayList<>();

    @BeforeMethod
    public void setUp() {
        list.add(point1);
        list.add(point2);
        list.add(point3);
        list.add(point4);
    }

    @Test
    public void testCreateInstance() {
        Tetrahedron actual = factory.createInstance("a", list);
        Tetrahedron expected = new Tetrahedron();
        expected.setPointList(list);
        expected.setTetrahedronName("a");
        Assert.assertEquals(actual, expected);
    }
}