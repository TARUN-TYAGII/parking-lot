package org.example.parkinglotaug25.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateParkingLotDto {
    private String name;
    private String address;
    private Integer floors;
}
