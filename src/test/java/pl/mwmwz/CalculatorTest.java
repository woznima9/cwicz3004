package pl.mwmwz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator(2, 5);

    @Before
    public void init() {
        System.out.println("Początek testów");
        calculator.b=10;

    }


    @Test
    public void wynikTest() {
        int oblicz = calculator.dodaj();
        assertEquals(2, calculator.a);
        assertEquals(5, calculator.b);
        assertEquals(7, oblicz);
        assertEquals(10, calculator.pomnoz());


    }

}