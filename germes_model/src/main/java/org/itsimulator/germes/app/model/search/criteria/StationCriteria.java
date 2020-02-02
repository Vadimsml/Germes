package org.itsimulator.germes.app.model.search.criteria;

import org.itsimulator.germes.app.model.entity.transport.TransportType;

import java.util.Objects;

public class StationCriteria {
    private String name;
    private TransportType transportType;
    private String address;

    //  Returns filtering criteria to search stations that
//  contains specified name parameter

    public static StationCriteria byName(String name) {
        return new StationCriteria(name);
    }

    private StationCriteria(final String name) {
        this.name = Objects.requireNonNull(name);
    }

    public StationCriteria(TransportType transportType) {
        this.transportType = Objects.requireNonNull(transportType);
    }
}
