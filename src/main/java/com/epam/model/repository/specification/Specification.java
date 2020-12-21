package com.epam.model.repository.specification;

import com.epam.model.entity.Tetrahedron;

public interface Specification {
    boolean specify(Tetrahedron tetrahedron);
}
