package org.example.parkinglotaug25.models;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entry;
    private Spot spot;
    private Vehicle vehicle;
    private Gate gate;
    private User user;
}
