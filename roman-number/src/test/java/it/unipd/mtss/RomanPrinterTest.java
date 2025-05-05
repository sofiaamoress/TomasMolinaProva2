////////////////////////////////////////////////////////////////////
// SOFIA MOLINA AMORES 2133323
// MARTA TOMAS ROMERA 2132924
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanPrinterTest {
    String letteraI = " _____  \n|_   _| \n  | |   \n  | |   \n _| |_  \n|_____| ";
    String letteraV = "__      __\n \\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    ";
    String letteraX = "__   __\n\\ \\ / /\n \\ V /  \n  > <   \n / · \\  \n/_/ \\_\\";
    String letteraL = " _       \n| |      \n| |      \n| |      \n| |_ _   \n|______| ";
    String letteraC = " _____  \n/  ___| \n| |     \n| |     \n| |___  \n\\_____| ";
    String letteraD = " _____   \n|  __ \\  \n| |  | | \n| |  | | \n| |__| | \n|_____/  ";
    String letteraM = " __  __  \n|  \\/  | \n| \\  / | \n| |\\/| | \n| |  | | \n|_|  |_| ";
    String letteraXLIV = "__   __    _          _____    __   __\n\\ \\ / /   | |        |_   _|   \\ \\ / /   \n \\ V /    | |          | |      \\ V /    \n  > <     | |          | |       > <     \n / · \\    | |_ _      _| |_     / · \\    \n/_/ \\_\\   |______|   |_____|   /_/ \\_\\   ";
    String letteraXCIV = "__   __    _____     _____    __      __\n\\ \\ / /   /  ___|   |_   _|   \\ \\    / /\n \\ V /    | |         | |      \\ \\  / /  \n  > <     | |         | |       \\ \\/ /    \n / · \\    | |___     _| |_       \\  /     \n/_/ \\_\\   \\_____|   |_____|       \\/      ";
    String letteraCXXIII = " _____    __   __   __   __    _____     _____     _____\n/  ___|   \\ \\ / /   \\ \\ / /   |_   _|   |_   _|   |_   _|  \n| |        \\ V /     \\ V /      | |       | |       | |     \n| |         > <       > <       | |       | |       | |     \n| |___     / · \\     / · \\     _| |_     _| |_     _| |_    \n\\_____|   /_/ \\_\\   /_/ \\_\\   |_____|   |_____|   |_____|   ";
    String letteraCCLIX = " _____     _____     _          _____    __   __ \n/  ___|   /  ___|   | |        |_   _|   \\ \\ / /   \n| |       | |       | |          | |      \\ V /    \n| |       | |       | |          | |       > <     \n| |___    | |___    | |_ _      _| |_     / · \\    \n\\_____|   \\_____|   |______|   |_____|   /_/ \\_\\   ";
    String letteraCDLXVIII = " _____     _____      _         __   __   __      __   _____     _____     _____ \n/  ___|   |  __ \\    | |        \\ \\ / /   \\ \\    / /  |_   _|   |_   _|   |_   _|   \n| |       | |  | |   | |         \\ V /     \\ \\  / /     | |       | |       | |     \n| |       | |  | |   | |          > <       \\ \\/ /      | |       | |       | |     \n| |___    | |__| |   | |_ _      / · \\       \\  /      _| |_     _| |_     _| |_    \n\\_____|   |_____/    |______|   /_/ \\_\\       \\/      |_____|   |_____|   |_____|   ";
    String letteraDLXXXVII = " _____      _         __   __   __   __   __   __   __      __   _____     _____ \n|  __ \\    | |        \\ \\ / /   \\ \\ / /   \\ \\ / /   \\ \\    / /  |_   _|   |_   _|   \n| |  | |   | |         \\ V /     \\ V /     \\ V /     \\ \\  / /     | |       | |     \n| |  | |   | |          > <       > <       > <       \\ \\/ /      | |       | |     \n| |__| |   | |_ _      / · \\     / · \\     / · \\       \\  /      _| |_     _| |_    \n|_____/    |______|   /_/ \\_\\   /_/ \\_\\   /_/ \\_\\       \\/      |_____|   |_____|   ";
    String letteraDCCXXXVI = " _____      _____     _____    __   __   __   __   __   __   __      __   _____ \n|  __ \\    /  ___|   /  ___|   \\ \\ / /   \\ \\ / /   \\ \\ / /   \\ \\    / /  |_   _|   \n| |  | |   | |       | |        \\ V /     \\ V /     \\ V /     \\ \\  / /     | |   \n| |  | |   | |       | |         > <       > <       > <       \\ \\/ /      | |     \n| |__| |   | |___    | |___     / · \\     / · \\     / · \\       \\  /      _| |_    \n|_____/    \\_____|   \\_____|   /_/ \\_\\   /_/ \\_\\   /_/ \\_\\       \\/      |_____|   ";
    String letteraCMLIV = " _____     __  __     _          _____    __      __ \n/  ___|   |  \\/  |   | |        |_   _|   \\ \\    / /  \n| |       | \\  / |   | |          | |      \\ \\  / /   \n| |       | |\\/| |   | |          | |       \\ \\/ /    \n| |___    | |  | |   | |_ _      _| |_       \\  /     \n\\_____|   |_|  |_|   |______|   |_____|       \\/      ";


    
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

