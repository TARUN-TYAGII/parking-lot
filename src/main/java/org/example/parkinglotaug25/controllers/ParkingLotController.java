package org.example.parkinglotaug25.controllers;

import org.example.parkinglotaug25.dtos.CreateParkingLotDto;
import org.example.parkinglotaug25.models.Floor;
import org.example.parkinglotaug25.models.ParkingLot;
import org.example.parkinglotaug25.repository.ParkingLotRepository;
import org.example.parkinglotaug25.services.ParkingLotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/parkingLot")
public class ParkingLotController {

    ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @PostMapping
    public ResponseEntity<ParkingLot> createParkingLot(@RequestBody CreateParkingLotDto parkingLotRequest){
        ParkingLot parkingLot = transform(parkingLotRequest);
        ParkingLot parkingLot1 = parkingLotService.createParkingLot(parkingLot);
        return new ResponseEntity<>(parkingLot1, HttpStatus.CREATED);
    }

    private ParkingLot transform(CreateParkingLotDto parkingLotRequest) {
        List<Floor> floors = new ArrayList<>();
        ParkingLot newParkingLot = ParkingLot.builder()
                .name(parkingLotRequest.getName())
                .address(parkingLotRequest.getAddress())
                .floors(floors)
                .build();
        return newParkingLot;
    }

    @GetMapping
    public ResponseEntity<List<ParkingLot>> getParkingLot(){
        List<ParkingLot> result= parkingLotService.getAllParkingLot();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
