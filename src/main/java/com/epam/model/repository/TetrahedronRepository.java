package com.epam.model.repository;

import com.epam.model.entity.Tetrahedron;
import com.epam.model.repository.specification.Specification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TetrahedronRepository {
    private List<Tetrahedron> tetrahedronList = new ArrayList<>();

    public boolean add(Tetrahedron pyramid) {
        return tetrahedronList.add(pyramid);
    }

    public boolean addAll(Collection<? extends Tetrahedron> c) {
        return tetrahedronList.addAll(c);
    }

    public Tetrahedron get(int index) {
        return tetrahedronList.get(index);
    }

    public Tetrahedron set(int index, Tetrahedron element) {
        return tetrahedronList.set(index, element);
    }

    public void add(int index, Tetrahedron element) {
        tetrahedronList.add(index, element);
    }

    public Tetrahedron remove(int index) {
        return tetrahedronList.remove(index);
    }

    public List<Tetrahedron> sort(Comparator<? super Tetrahedron> c) {
        List<Tetrahedron> result = new ArrayList<>(tetrahedronList);
        result.sort(c);
        return result;
    }

    public List<Tetrahedron> query(Specification specification) {
        List<Tetrahedron> list = tetrahedronList.stream().filter(specification::specify).collect(Collectors.toList());
        return list;
    }
}