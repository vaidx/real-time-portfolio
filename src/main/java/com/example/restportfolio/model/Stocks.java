package com.example.restportfolio.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="STOCKS")
public class Stocks {

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

    @Column(name="MU")
    private double mu; // expected return on the stock + static + unique value between 0 and 1
    @Column(name="SIGMA")
    private double sigma; // annualized standard deviation + static + unique value between 0 and 1
}
