package org.parkingLot.repositories;


import org.parkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Optional;

public class ParkingLotRepository {

    private HashMap<Long, ParkingLot> db;

    public Optional<ParkingLot> getParkingLotById(Long id) {
        if (db.containsKey(id)) {
            return Optional.of(db.get(id));
        }
        return Optional.empty();

    }
}
