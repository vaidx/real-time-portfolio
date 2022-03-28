package com.example.restportfolio;

import com.example.restportfolio.service.OptionsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.apache.commons.math3.util.Precision.round;
import static org.junit.jupiter.api.Assertions.*;

class OptionsServiceTest {

    @Autowired
    private OptionsService os;

    @Test
    void testCalculate() {
        double cp = os.calculate("aapl",25,"CE",30,2,0.15);
        double pp = os.calculate("aapl",25,"PE",30,2,0.15);

        assertEquals(round(cp, 3), 0.852);
        assertEquals(round(pp, 3), 4.675);
    }
}
