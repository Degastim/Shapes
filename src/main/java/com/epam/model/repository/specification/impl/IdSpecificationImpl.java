package com.epam.model.repository.specification.impl;

import com.epam.model.entity.Tetrahedron;
import com.epam.model.repository.specification.Specification;

public class IdSpecificationImpl implements Specification {
    private long id;

    public IdSpecificationImpl(long id) {
        this.id = id;
    }

    @Override
    public boolean specify(Tetrahedron tetrahedron) {
        return (tetrahedron.getId() == id);
    }
}
