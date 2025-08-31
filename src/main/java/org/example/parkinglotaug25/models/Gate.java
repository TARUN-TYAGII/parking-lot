package org.example.parkinglotaug25.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Gate extends BaseModel{
    private Integer gateNumber;
    private GateOperator operator;
}
