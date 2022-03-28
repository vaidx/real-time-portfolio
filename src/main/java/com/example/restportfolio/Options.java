package com.example.restportfolio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="OPTIONS")
public class Options {

    @Id
    @Column(name="TICKER")
    private String ticker;
    @Column(name="PRICE")
    private BigDecimal price;
    @Column(name="QTY")
    private int qty;
    @Column(name="TYPE")
    private String type;
    @Column(name="POSITION")
    private int pos; // Long ( =+1 ) or Short ( =-1 )

    @Column(name="TIME_TO_MAT")
    private int timeToMaturity; // in years
    @Column(name="STRIKE_PRICE")
    private BigDecimal strikePrice;
    @Column(name="STD_DEV")
    private double stDev;
}