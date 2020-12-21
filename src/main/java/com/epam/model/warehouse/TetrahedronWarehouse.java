package com.epam.model.warehouse;

import com.epam.model.entity.TetrahedronProperty;

import java.util.HashMap;
import java.util.Map;

public class TetrahedronWarehouse {
    private final static TetrahedronWarehouse warehouse = new TetrahedronWarehouse();

    private Map<Long, Double> SquareStorage = new HashMap<>();
    private Map<Long, Double> VolumeStorage = new HashMap<>();
    private Map<Long, Double> PerimeterStorage = new HashMap<>();

    public static TetrahedronWarehouse getWarehouse() {
        return warehouse;
    }

    public Double get(Long id, String parameter) throws EnumConstantNotPresentException {
        TetrahedronProperty property = TetrahedronProperty.valueOf(parameter.toUpperCase());
        switch (property) {
            case SQUARE:
                return SquareStorage.get(id);
            case VOLUME:
                return VolumeStorage.get(id);
            default:
                return PerimeterStorage.get(id);
        }
    }

    public void put(Long id, String parameter, Double value) {
        TetrahedronProperty property = TetrahedronProperty.valueOf(parameter.toUpperCase());
        switch (property) {
            case SQUARE:
                SquareStorage.put(id, value);
                break;
            case VOLUME:
                VolumeStorage.put(id, value);
                break;
            default:
                PerimeterStorage.put(id, value);
        }
    }

    public void remove(Long id, String parameter) {
        TetrahedronProperty property = TetrahedronProperty.valueOf(parameter.toUpperCase());
        switch (property) {
            case SQUARE:
                SquareStorage.remove(id);
                break;
            case VOLUME:
                VolumeStorage.remove(id);
                break;
            default:
                PerimeterStorage.remove(id);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TetrahedronWarehouse{");
        sb.append("SquareStorage=").append(SquareStorage);
        sb.append(", VolumeStorage=").append(VolumeStorage);
        sb.append(", PerimeterStorage=").append(PerimeterStorage);
        sb.append('}');
        return sb.toString();
    }
}
