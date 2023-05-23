package io.gofannon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VatCalculatorBbTest {
    private VatCalculator vatCalculator;

    @BeforeEach
    void setUp() {
        vatCalculator = new VatCalculator();
    }

    @Test
    void getReducedRate() {
        assertEquals(5.5f, vatCalculator.getReducedRate());
    }

    @Test
    void getParticularRate() {
        assertEquals(2.1f, vatCalculator.getParticularRate());
    }
}