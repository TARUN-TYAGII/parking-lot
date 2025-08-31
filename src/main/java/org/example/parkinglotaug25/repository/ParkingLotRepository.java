package org.example.parkinglotaug25.repository;

import org.example.parkinglotaug25.models.ParkingLot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ParkingLotRepository {
    List<ParkingLot> parkingLots = new ArrayList<>();

    public List<ParkingLot> getAllParkingLot(){
        return parkingLots;
    }

    public ParkingLot getParkingLotById(int id){
        return null;
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot){
        parkingLots.add(parkingLot);
        return parkingLot;
    }
}
