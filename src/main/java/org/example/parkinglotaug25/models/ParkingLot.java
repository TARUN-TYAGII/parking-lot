package org.example.parkinglotaug25.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private String address;
    private List<Floor> floors = new ArrayList<>();
    private Display display;
    private List<Gate> entryGate = new ArrayList<>();
    private List<Gate> exitGate =new ArrayList<>();


}
