package org.itsimulator.germes.app.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.itsimulator.germes.app.infra.util.CommonUtil;
import org.itsimulator.germes.app.model.entity.geography.City;
import org.itsimulator.germes.app.service.GeographicService;

public class GeographicServiceImpl implements GeographicService {
    private final List<City> cities;

    public GeographicServiceImpl() {
        this.cities = new ArrayList<City>();
    }

    @Override
    public List<City> findCities() {
        return CommonUtil.getSafeList(cities);
    }

    @Override
    public void saveCity(City city) {
        if (!cities.contains(city)) {
            cities.add(city);
        }
    }
}
