package br.lista6.teste.ex01;

import br.lista6.ex01.Agricultural;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgriculturalTest {

    private Agricultural agricultural;

    @Before
    public void setUp() {
        agricultural = new Agricultural("TestAgricultural", 100, 150);
    }

    @Test
    public void testCalculatePrice() {

        double expected = 117.0;
        assertEquals(expected, agricultural.calculatePrice(), 0.01);
    }

    @Test
    public void testCalculateTransport() {

        double expected = 12.0;
        assertEquals(expected, agricultural.calculateTransport(), 0.01);
    }

}
