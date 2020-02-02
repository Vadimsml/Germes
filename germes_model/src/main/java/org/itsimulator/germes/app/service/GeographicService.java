package org.itsimulator.germes.app.service;

import org.itsimulator.germes.app.model.entity.geography.City;

import java.util.List;

public interface GeographicService {
    List<City> findCities();

    void saveCity(City city);
}
