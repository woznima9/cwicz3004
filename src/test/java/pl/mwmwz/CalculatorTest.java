package pl.mwmwz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void wynikTest() {
        Calculator calculator = new Calculator();
        int oblicz = calculator.dodaj();
        assertEquals(2, calculator.a);
        assertEquals(5, calculator.b);
        assertEquals(7, oblicz);
        assertEquals(10, calculator.pomnoz());


    }

}