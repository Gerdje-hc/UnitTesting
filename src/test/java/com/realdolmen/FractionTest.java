package com.realdolmen;

import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by vdabcursist on 05/07/2017.
 */
public class FractionTest {

    private Fraction fraction1;
    private Fraction fraction2;

    @Before
    public void init() {
        fraction1 = new Fraction(1, 2);
        fraction2 = new Fraction(50,100);
    }

    @Test

    public void testCreateFraction () {

        assertNotNull(fraction1);
        assertEquals(1,fraction1.numerator());
        assertEquals(2,fraction1.denominator());
    }
    @Test

    public void testSimplifyFraction (){

        assertNotNull (fraction2);
        assertEquals(1, fraction2.numerator());
        assertEquals(2,fraction2.denominator());
    }
    @Test
    public void testPrintToStringFraction () {

        assertNotNull(fraction1);
        assertEquals("1/2",fraction1.toString());
    }



}
