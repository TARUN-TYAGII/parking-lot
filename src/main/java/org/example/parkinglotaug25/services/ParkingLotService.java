package org.example.parkinglotaug25.services;

import org.example.parkinglotaug25.models.ParkingLot;
import org.example.parkinglotaug25.models.PaymentCounter;
import org.example.parkinglotaug25.repository.ParkingLotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotService {

    ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public List<ParkingLot>  getAllParkingLot() {
        return parkingLotRepository.getAllParkingLot();
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot) {
        return parkingLotRepository.createParkingLot(parkingLot);
    }
}
