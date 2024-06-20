package br.lista6.teste.ex01;

import static org.junit.Assert.*;

import br.lista6.ex01.Industrialized;
import org.junit.Before;
import org.junit.Test;

public class IndustrializedTest1 {

    private Industrialized product;

    @Before
    public void setUp() {

        product = new Industrialized("TestProduct", 17, 190);
    }

    @Test
    public void testCalculatePrice() {

        double expected = 75.785;
        assertEquals(expected, product.calculatePrice(), 0.01);
    }

    @Test
    public void testCalculateTransport() {

        double expected = 57.0;
        assertEquals(expected, product.calculateTransport(), 0.01);
    }

    @Test
    public void testCalculateFinalPrice() {

        double expected = 89.12316;
        assertEquals(expected, product.calculateFinalPrice(), 0.01);
    }
}


