package com.example.restportfolio;

import lombok.Data;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.util.FastMath;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class StocksService {
        NormalDistribution nd = new NormalDistribution();
        private final static long DTGBM_value = 7257600;

        // TODO: Use FastMath

        // Discrete Time Geometric Brownian Motion
        // delta_time is in seconds

        // delta_stockPrice = ((0.03×(2÷7257600)) + (0.15×0.56×√(2÷7257600))) * 25 = 0.001102603
        // newPrice = 25 + 0.001102603 = 25.001102603

        BigDecimal calculateUpdatedPrice(String ticker, BigDecimal stockPrice, int qty, double mu, double sigma, long time) {
                BigDecimal delta_stockPrice = BigDecimal.valueOf((mu * (time / DTGBM_value ) + (sigma * getEpsilon() * Math.sqrt(time / DTGBM_value))));
                BigDecimal updatedPrice = stockPrice.add(stockPrice.multiply(delta_stockPrice));
                return updatedPrice;
        }

        double getEpsilon() {
                // random variable that is drawn from a standardized normal distribution every time this formula is invoked.
                return nd.sample();
        }

}
