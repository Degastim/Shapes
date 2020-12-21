package com.epam.model.repository.specification.impl;

import com.epam.model.entity.Tetrahedron;
import com.epam.model.repository.specification.Specification;

public class NameSpecificationImpl implements Specification {
    private long name;

    public NameSpecificationImpl(long name) {
        this.name = name;
    }

    @Override
    public boolean specify(Tetrahedron tetrahedron) {
        return (tetrahedron.getTetrahedronName().equals(name));
    }
}
