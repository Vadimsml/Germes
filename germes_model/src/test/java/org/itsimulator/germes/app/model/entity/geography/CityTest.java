package org.itsimulator.germes.app.model.entity.geography;

import org.itsimulator.germes.app.model.entity.transport.TransportType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CityTest {
    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }

    private City city;

    @Before
    public void setup() {
        city = new City("TestCity");
    }

    @Test
    public void testAddValidStationSuccess() {
        Station station = city.addStation(TransportType.AUTO);

//        city.addStation(TransportType.AUTO);

        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullStationFailure() {
        city.addStation(null);

        assertTrue(false);
    }

    @Test
    public void testAddDuplicateStation() {
        Station station = city.addStation(TransportType.AUTO);
        station = city.addStation(TransportType.AUTO);

//        city.addStation(station);
//        city.addStation(station);

        assertEquals(city.getStations().size(), 1);
    }

    @Test
    public void testRemoveStationSuccess() {
        Station station = city.addStation(TransportType.AUTO);
        city.removeStation(station);

        assertTrue(city.getStations().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveNullStationFailure() {
        city.removeStation(null);

        assertTrue(false);
    }
}