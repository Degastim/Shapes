package com.epam.model.observer.impl;

import com.epam.model.entity.Tetrahedron;
import com.epam.model.observer.CustomObserver;
import com.epam.model.observer.TetrahedronEvent;
import com.epam.model.service.TetrahedronService;
import com.epam.model.service.impl.TetrahedronServiceImpl;
import com.epam.model.warehouse.TetrahedronWarehouse;
import com.epam.validator.TetrahedronValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TetrahedronCustomObserver implements CustomObserver {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void parameterChanged(TetrahedronEvent event) {
        Tetrahedron tetrahedron = event.getSource();

        if (TetrahedronValidator.tetrahedronValidation(tetrahedron)) {
            TetrahedronService tetrahedronService = new TetrahedronServiceImpl();
            double volume = tetrahedronService.calculateVolume(tetrahedron);
            TetrahedronWarehouse.getWarehouse().put(tetrahedron.getId(), "volume", volume);
            double perimeter = tetrahedronService.calculatePerimeter(tetrahedron);
            TetrahedronWarehouse.getWarehouse().put(tetrahedron.getId(), "square", perimeter);
            logger.log(Level.INFO, "Recalculation of values warehouse");
        }
    }
}
