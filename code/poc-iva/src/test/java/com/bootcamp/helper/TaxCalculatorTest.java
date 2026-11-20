package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

    private static final double DELTA = 0.0001;
    private static final double IVA = 16.0;

    @Test
    void shouldCalculateIvaWhenPriceIsGreaterThanZero() {
        double valorProducto = 100.0;
        TaxCalculator calculator = new TaxCalculator(IVA);

        double ivaCalculado = calculator.calculateIva(valorProducto);

        assertEquals(16.0, ivaCalculado, DELTA);
    }
    
    @Test
    void isLessThanZero() {
    	double valorProducto = -1.0;
    	TaxCalculator calculator = new TaxCalculator(IVA);
    	
    	double ivaCalculado = calculator.calculateIva(valorProducto);
    	
    	assertEquals(0.0, ivaCalculado, DELTA);
    }
    
    @Test
    void isEqualThanZero() {
    	double valorProducto = 0.0;
    	TaxCalculator calculator = new TaxCalculator(IVA);
    	
    	double ivaCalculado = calculator.calculateIva(valorProducto);
    	
    	assertEquals(0.0, ivaCalculado, DELTA);
    }
    
    

 }
