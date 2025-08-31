package org.example.parkinglotaug25.models;

import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
public class Ticket extends BaseModel{
    private Date entry;
    private Spot spot;
    private Vehicle vehicle;
    private Gate gate;
    private User user;
}
