////////////////////////////////////////////////////////////////////
// SOFIA MOLINA AMORES 2133323
// MARTA TOMAS ROMERA 2132924
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    //Boundary test
    @Test(expected=IllegalArgumentException.class)
    public void testUpperBoundary() {
        IntegerToRoman.convert(1001);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testLowerBoundary() {
        IntegerToRoman.convert(-1);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testExtremeBoundary() {
        IntegerToRoman.convert(2867);
    }

    //NullPointer
    @Test(expected=NullPointerException.class)
    public void testNullArgument() {
        int num = null;
        IntegerToRoman.convert(num);
    }

    //TEST DI OUTPUT
    //test zero (numero speciale e lower boundary)
    @Test
    public void testZero() {
        assertEquals("", IntegerToRoman.convert(0));
    }

    //test mila (numero speciale e upper boundary)
    //così testamo anche la funzione privata "thousands"
    @Test
    public void testThousand() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    //test numeri basici
    //serve anche como prova delle funzioni privati units, tens e hundreds
    @Test
    public void testBasicNumbers() {
        String expectedOutput[] = {"I","V","X","L","C","D"};
        String output[] = {
            IntegerToRoman.convert(1),
            IntegerToRoman.convert(5),
            IntegerToRoman.convert(10),
            IntegerToRoman.convert(50),
            IntegerToRoman.convert(100),
            IntegerToRoman.convert(500)
        }
        assertEquals(expetedOutput,output);
    }

    //test numeri complessità 1
    @Test
    public void testNumbersComplex1() {
        String expectedOutput[] = {"IV","IX","XL","XC","CD","CM"};
        String output[] = {
            IntegerToRoman.convert(4),
            IntegerToRoman.convert(9),
            IntegerToRoman.convert(40),
            IntegerToRoman.convert(90),
            IntegerToRoman.convert(400),
            IntegerToRoman.convert(900),
        }
        assertEquals(expetedOutput,output);
    }

     //test numeri complessità 2 (numeri estremi)
    @Test
    public void testNumbersComplex2() {
        String expectedOutput[] = {"XLIX","XCIV","CDXLIV","DCCCXCIX","CMXCIX"};
        String output[] = {
            IntegerToRoman.convert(49),
            IntegerToRoman.convert(94),
            IntegerToRoman.convert(444),
            IntegerToRoman.convert(899),
            IntegerToRoman.convert(999),
        }
        assertEquals(expetedOutput,output);
    }

    //test numeri random
    @Test
    public void testRandomNumbers() {
        String expectedOutput[] = {"VIII","LXXIII","CCCLII","DI","DCLXXXIX","DCCCXXII"};
        String output[] = {
            IntegerToRoman.convert(8),
            IntegerToRoman.convert(73),
            IntegerToRoman.convert(352),
            IntegerToRoman.convert(501),
            IntegerToRoman.convert(689),
            IntegerToRoman.convert(822),
        }
        assertEquals(expetedOutput,output);
    }
}
