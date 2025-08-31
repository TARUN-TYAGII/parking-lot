package org.example.parkinglotaug25.models;

import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
public class Invoice extends BaseModel{
    private Date exitTime;
    private Ticket ticket;
    private Double amount;
    private Gate exitGate;
    private Payment payment;
}
