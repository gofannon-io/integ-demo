package io.gofannon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VatCalculatorTest {

    private VatCalculator vatCalculator;

    @BeforeEach
    void setUp() {
        vatCalculator = new VatCalculator();
    }

    @Test
    void getStandardRate() {
        assertEquals(20f, vatCalculator.getStandardRate());
    }

    @Test
    void getIntermediateRate() {
        assertEquals(10f, vatCalculator.getIntermediateRate());
    }
}