package org.example.parkinglotaug25.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ExitGate extends Gate{
    private PaymentCounter paymentCounter;
}
