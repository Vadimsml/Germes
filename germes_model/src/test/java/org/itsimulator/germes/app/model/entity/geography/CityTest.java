package org.itsimulator.germes.app.model.entity.geography;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityTest {
    private boolean containsStation (City city, Station station) {
        return city.getStations().contains(station);
    }
    @Test
    public void testAddValidStationSuccess() {
        City city = new City();
        Station station = new Station();

        city.addStation(station);

        assertTrue(containsStation(city,station));
        assertEquals(city,station.getCity());
    }

}