////////////////////////////////////////////////////////////////////
// SOFIA MOLINA AMORES 2133323
// MARTA TOMAS ROMERA 2132924
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanPrinterTest {
    String letteraI = new String[]{
        		    " _____  ",
                "|_   _| ",
                "  | |   ",
                "  | |   ",
                " _| |_  ",
                "|_____| "
        };
    String letteraV = new String[]{
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    "
        };
    String letteraX = new String[]{
                "__   __",
                "\\ \\ / /",
                " \\ V /  ",
                "  > <   ",
                " / · \\  ",
                "/_/ \\_\\"
        };
    String letteraL = new String[]{
                " _       ",
        		    "| |      ",
                "| |      ",
                "| |      ",
                "| |_ _   ",
                "|______| "
        };
    String letteraC = new String[]{
                " _____  ",
        		    "/  ___| ",
                "| |     ",
                "| |     ",
                "| |___  ",
                "\\_____| "
        };
    String letteraD = new String[]{
                " _____   ",
        		    "|  __ \\  ",
                "| |  | | ",
                "| |  | | ",
                "| |__| | ",
                "|_____/  "
        };
    String letteraM = new String[]{
                " __  __  ",
        		    "|  \\/  | ",
                "| \\  / | ",
                "| |\\/| | ",
                "| |  | | ",
                "|_|  |_| "
        };
    
    String letteraXLIV = new String[]{
        		"__   __    _          _____    __   __",   
"\\ \\ / /   | |        |_   _|   \\ \\ / /   ",
" \\ V /    | |          | |      \\ V /    ",
"  > <     | |          | |       > <     ",
" / · \\    | |_ _      _| |_     / · \\    ",
"/_/ \\_\\   |______|   |_____|   /_/ \\_\\   "
        };
    String letteraXCIV = new String[]{
                "__   __    _____     _____    __      __",  
"\\ \ / /   /  ___|   |_   _|   \\ \\    / /",
" \\ V /    | |         | |      \\ \\  / /  ",
"  > <     | |         | |       \\ \\/ /    ",
" / · \\    | |___     _| |_       \\  /     ",
"/_/ \\_\\   \_____|   |_____|       \\/      "
        };
    String letteraCXXIII = new String[]{
                " _____    __   __   __   __    _____     _____     _____",    
"/  ___|   \\ \\ / /   \\ \\ / /   |_   _|   |_   _|   |_   _|  ",  
"| |        \\ V /     \\ V /      | |       | |       | |     ",
"| |         > <       > <       | |       | |       | |     ",
"| |___     / · \\     / · \\     _| |_     _| |_     _| |_    ",
"\\_____|   /_/ \\_\\   /_/ \\_\\   |_____|   |_____|   |_____|   "
        };
    String letteraCCLIX = new String[]{
                " _____     _____     _          _____    __   __ ",  
"/  ___|   /  ___|   | |        |_   _|   \\ \\ / /   ",
"| |       | |       | |          | |      \\ V /    ",
"| |       | |       | |          | |       > <     ",
"| |___    | |___    | |_ _      _| |_     / · \\    ",
"\|_____|   \|_____|   |______|   |_____|   /_/ \\_\\   "
        };
    String letteraCDLXVIII = new String[]{
                " _____     _____      _         __   __   __      __   _____     _____     _____ ",   
"/  ___|   |  __ \\    | |        \\ \\ / /   \\ \\    / /  |_   _|   |_   _|   |_   _|   ",
"| |       | |  | |   | |         \\ V /     \\ \\  / /     | |       | |       | |     ",
"| |       | |  | |   | |          > <       \\ \\/ /      | |       | |       | |     ",
"| |___    | |__| |   | |_ _      / · \\       \\  /      _| |_     _| |_     _| |_    ",
"\\_____|   |_____/    |______|   /_/ \\_\\       \\/      |_____|   |_____|   |_____|   "
        };
    String letteraDLXXXVII = new String[]{
                " _____      _         __   __   __   __   __   __   __      __   _____     _____ ",   
"|  __ \\    | |        \\ \\ / /   \\ \\ / /   \\ \\ / /   \\ \\    / /  |_   _|   |_   _|   ",
"| |  | |   | |         \\ V /     \\ V /     \\ V /     \\ \\  / /     | |       | |     ",
"| |  | |   | |          > <       > <       > <       \\ \\/ /      | |       | |     ",
"| |__| |   | |_ _      / · \\     / · \\     / · \\       \\  /      _| |_     _| |_    ",
"|_____/    |______|   /_/ \\_\\   /_/ \\_\\   /_/ \\_\\       \\/      |_____|   |_____|   "
        };
    String letteraDCCXXXVI = new String[]{
                " _____      _____     _____    __   __   __   __   __   __   __      __   _____ ",   
"|  __ \\    /  ___|   /  ___|   \\ \\ / /   \\ \\ / /   \\ \\ / /   \\ \\    / /  |_   _|   ",
"| |  | |   | |       | |        \\ V /     \\ V /     \\ V /     \\ \\  / /     | |   ",  
"| |  | |   | |       | |         > <       > <       > <       \\ \\/ /      | |     ",
"| |__| |   | |___    | |___     / · \\     / · \\     / · \\       \\  /      _| |_    ",
"|_____/    \\_____|   \\_____|   /_/ \\_\\   /_/ \\_\\   /_/ \\_\\       \\/      |_____|   "
        };
    String letteraCMLIV = new String[]{
                " _____     __  __     _          _____    __      __ ",  
"/  ___|   |  \/  |   | |        |_   _|   \\ \\    / /  ",
"| |       | \  / |   | |          | |      \\ \\  / /   ",
"| |       | |\/| |   | |          | |       \\ \\/ /    ",
"| |___    | |  | |   | |_ _      _| |_       \\  /     ",
"\\_____|   |_|  |_|   |______|   |_____|       \\/      "
        };


    
    @Test
    public void testPrint() {
        assertEquals(letteraI, RomanPrinter.print(1));
        assertEquals(letteraV, RomanPrinter.print(5));
        assertEquals(letteraX, RomanPrinter.print(10));
        assertEquals(letteraL, RomanPrinter.print(50));
        assertEquals(letteraC, RomanPrinter.print(100));
        assertEquals(letteraD, RomanPrinter.print(500));
        assertEquals(letteraM, RomanPrinter.print(1000));
        assertEquals(letteraXLIV, RomanPrinter.print(49));
        assertEquals(letteraXCIV, RomanPrinter.print(94));
        assertEquals(letteraCXXIII, RomanPrinter.print(123));
        assertEquals(letteraCCLIX, RomanPrinter.print(259));
        assertEquals(letteraCDLXVIII, RomanPrinter.print(468));
        assertEquals(letteraDLXXXVII, RomanPrinter.print(587));
        assertEquals(letteraDCCXXXVI, RomanPrinter.print(736));
        assertEquals(letteraCMLIV, RomanPrinter.print(954));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintNegativeNumber() {
        RomanPrinter.print(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintNumberZero() {
        RomanPrinter.print(0);
    }
}

