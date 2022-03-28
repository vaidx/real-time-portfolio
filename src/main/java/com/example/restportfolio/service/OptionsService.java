package com.example.restportfolio.service;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.springframework.stereotype.Service;

@Service
public class OptionsService {

    private final static double R = 0.02; // risk free rate per annum

    // Assume stock option does not pay dividend
    public static double calculate(String ticker, double spotPrice, String type, double strikePrice, double ttm, double sigma) {

        double blackScholesOptionPrice = 0.0;
        double d1 = (Math.log(spotPrice / strikePrice) + (R + Math.pow(sigma, 2) / 2) * ttm) / (sigma * Math.sqrt(ttm));
        double d2 = d1 - sigma * Math.sqrt(ttm);
        NormalDistribution nd = new NormalDistribution();

        // if the security is a call option
        if (type.equals("CE")) {
            blackScholesOptionPrice = spotPrice * nd.cumulativeProbability(d1) - strikePrice * Math.exp(-R * ttm) * nd.cumulativeProbability(d2);
        }
        // if the security is a put option
        else {
            blackScholesOptionPrice = strikePrice * Math.exp(-R * ttm) * nd.cumulativeProbability(-d2) - spotPrice * nd.cumulativeProbability(-d1);
        }

        return blackScholesOptionPrice;
    }
}
