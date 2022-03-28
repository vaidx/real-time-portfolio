package com.example.restportfolio;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
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
    private int position; // Long ( =+1 ) or Short ( =-1 )

    @Column(name="TTM")
    private double ttm; // time to maturity in years
    @Column(name="STRIKE_PRICE")
    private BigDecimal strikePrice;
    @Column(name="SIGMA")
    private double sigma;
}
