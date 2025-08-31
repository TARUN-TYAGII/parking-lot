package org.example.parkinglotaug25.models;

import lombok.experimental.SuperBuilder;
import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.List;

@SuperBuilder
public class Floor extends BaseModel{
    Integer floorNumber;
    List<Spot> parkingSpots = new ArrayList<>();
    Display display;
    Counter counter;
}
