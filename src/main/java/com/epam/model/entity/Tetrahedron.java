package com.epam.model.entity;

import com.epam.util.IdGenerator;

import java.util.Set;

public class Tetrahedron {
    private long tetrahedronId = IdGenerator.getCurrentId();
    private String tetrahedronName;
    private Set<Point> pointSet;

    public Tetrahedron(long tetrahedronId, String tetrahedronName, Set<Point> pointSet) {
        this.tetrahedronId = tetrahedronId;
        this.tetrahedronName = tetrahedronName;
        this.pointSet = Set.copyOf(pointSet);
    }

    public Tetrahedron() {
    }

    public long getTetrahedronId() {
        return tetrahedronId;
    }

    public void setTetrahedronId(long tetrahedronId) {
        this.tetrahedronId = tetrahedronId;
    }

    public String getTetrahedronName() {
        return tetrahedronName;
    }

    public void setTetrahedronName(String tetrahedronName) {
        this.tetrahedronName = tetrahedronName;
    }

    public Set<Point> getPointSet() {
        return pointSet;
    }

    public void setPointSet(Set<Point> pointSet) {
        this.pointSet = Set.copyOf(pointSet);
    }
}
