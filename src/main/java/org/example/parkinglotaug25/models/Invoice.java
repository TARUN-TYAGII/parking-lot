package org.example.parkinglotaug25.models;

import java.util.Date;

public class Invoice extends BaseModel{
    private Date exitTime;
    private Ticket ticket;
    private Double amount;
    private Gate exitGate;
    private Payment payment;
}
