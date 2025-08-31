package org.example.parkinglotaug25.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Vehicle extends BaseModel{
    private String number;
    private VehicleType vehicleType;
}
