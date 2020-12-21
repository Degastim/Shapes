package com.epam.model.entity;

import com.epam.model.observer.CustomObserver;
import com.epam.model.observer.Observable;
import com.epam.model.observer.TetrahedronEvent;
import com.epam.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Tetrahedron extends AbstractFigure implements Observable {
    private long tetrahedronId = IdGenerator.getCurrentId();
    private String tetrahedronName;
    private List<Point> pointList;
    private List<CustomObserver> observers = new ArrayList<>();

    public Tetrahedron(long tetrahedronId, String tetrahedronName, List<Point> pointList) {
        this.tetrahedronId = tetrahedronId;
        this.tetrahedronName = tetrahedronName;
        this.pointList = new ArrayList<>(pointList);
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

    public List<Point> getPointList() {
        return new ArrayList<>(pointList);
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = new ArrayList<>(pointList);
    }

    @Override
    public void attach(CustomObserver observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(CustomObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        TetrahedronEvent pyramidEvent = new TetrahedronEvent(this);
        for (CustomObserver observer : observers) {
            observer.parameterChanged(pyramidEvent);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tetrahedron that = (Tetrahedron) o;
        if (!tetrahedronName.equals(that.tetrahedronName)) return false;
        return pointList.equals(that.pointList);
    }

    @Override
    public int hashCode() {
        int result = 0;
        result += tetrahedronId;
        result += tetrahedronName.hashCode();
        result += pointList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tetrahedron{");
        sb.append("tetrahedronId=").append(tetrahedronId);
        sb.append(", tetrahedronName='").append(tetrahedronName).append('\'');
        sb.append(", pointList=").append(pointList);
        sb.append('}');
        return sb.toString();
    }
}
