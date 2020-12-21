package com.epam.model.service;

import com.epam.model.entity.Tetrahedron;

public interface TetrahedronService {
    double calculatePerimeter(Tetrahedron tetrahedron);

    double calculateVolume(Tetrahedron tetrahedron);
}
