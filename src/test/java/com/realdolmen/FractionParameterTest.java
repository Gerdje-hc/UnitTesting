package com.realdolmen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by vdabcursist on 05/07/2017.
 */
@RunWith(Parameterized.class)
public class FractionParameterTest {

    @Parameterized.Parameter (0) public Fraction a;
    @Parameterized.Parameter (1) public Fraction b;
    @Parameterized.Parameter (2) public Fraction expectedSom;
    @Parameterized.Parameter (3) public Fraction expectedAftrekken;
    @Parameterized.Parameter (4) public Fraction expectedVermenigvuldigen;
    @Parameterized.Parameter (5) public Fraction expectedDeling;

    @Parameterized.Parameters
    public static Collection<Fraction[]> params() {
        return Arrays.asList(new Fraction[][]{
                {
                        new Fraction(5, 20),
                        new Fraction(5,20),
                        new Fraction(50,400),
                        new Fraction(0,1),
                        new Fraction(0,1),
                        new Fraction(0,1)
                },

                {
                        new Fraction(4, 23),
                        new Fraction(7,35),
                        new Fraction(277,805),
                        new Fraction(-3,115),
                        new Fraction(0,1),
                        new Fraction(0,1)
                },
                {
                        new Fraction(4, 23),
                        new Fraction(7,35),
                        new Fraction(277,805),
                        new Fraction(-3,115),
                        new Fraction(0,1),
                        new Fraction(0,1),
                }


        });


    }
    @Test
    public void shouldAddFractions (){
       assertEquals (expectedSom, a.add(b));
    }

    @Test
    public void shouldSubstract (){
        assertEquals (expectedAftrekken, a.substract(b));
    }
}
