package org.parkingLot.strategies;


import org.parkingLot.models.Gate;
import org.parkingLot.models.ParkingSpot;
import org.parkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {

    ParkingSpot getSpot(Long parkingLotId, Gate gate, VehicleType vehicleType);
}