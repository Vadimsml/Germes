package org.itsimulator.germes.app.model.entity.geography;

import java.util.*;

import org.itsimulator.germes.app.model.entity.base.AbstractEntity;
import org.itsimulator.germes.app.model.entity.transport.TransportType;

/**
 * Any locality that contains transport stations
 *
 * @author admin
 */
public class City extends AbstractEntity {
    private String name;

    /**
     * Name of the district where city is placed
     */
    private String district;

    /**
     * Name of the region where district is located.
     * Region is top-level area in the country
     */
    private String region;

    /**
     * Set of transport stations that is linked to this
     * loyality
     */
    private Set<Station> stations;

    public City(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<Station> getStations() {
        return CommonUtil.getSafeSet(stations);
    }

    public Station addStation(final TransportType transportType) {
        Objects.requireNonNull(transportType, "transportType parameter is not initialized");
        if (stations == null) {
            stations = new HashSet<>();
        }
        Station station = new Station(this, transportType);
        stations.add(station);
//        station.setCity(this);
        return station;
    }

    public void removeStation(Station station) {
        Objects.requireNonNull(station, "station parameter is not initialized");
        if (this.stations == null) {
            return;
        }
        this.stations.remove(station);
    }
}
