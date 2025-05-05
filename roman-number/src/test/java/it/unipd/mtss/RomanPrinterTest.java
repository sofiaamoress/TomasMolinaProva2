////////////////////////////////////////////////////////////////////
// SOFIA MOLINA AMORES 2133323
// MARTA TOMAS ROMERA 2132924
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanPrinterTest {
	
	private static String convertToString(String[] number){
		StringBuilder[] lines = new StringBuilder[6];
	      for (int i = 0; i < 6; i++) {
	          lines[i] = new StringBuilder();
	      }

	      for (int i = 0; i < 6; i++) {
              lines[i].append(String.format("%-" + 8 + "s", number[i])).append("  "); 
          }

	      StringBuilder result = new StringBuilder();
	      for (StringBuilder line : lines) {
	          result.append(line.toString()).append("\n");
	      }

	      return result.toString();
	}
	
	
    String[] letI = new String[]{
        		    " _____  ",
                "|_   _| ",
                "  | |   ",
                "  | |   ",
                " _| |_  ",
                "|_____| "
        };
    String letteraI = convertToString(letI);
    
    
    String[] letV = new String[]{
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    "
        };
    String letteraV = convertToString(letV);
    
    String[] letX = new String[]{
                "__   __",
                "\\ \\ / /",
                " \\ V /  ",
                "  > <   ",
                " / · \\  ",
                "/_/ \\_\\"
        };
    String letteraX = convertToString(letX);
    
    String[] letL = new String[]{
                " _       ",
        		    "| |      ",
                "| |      ",
                "| |      ",
                "| |_ _   ",
                "|______| "
        };
    String letteraL = convertToString(letL);
    
    String[] letC = new String[]{
                " _____  ",
        		    "/  ___| ",
                "| |     ",
                "| |     ",
                "| |___  ",
                "\\_____| "
        };
    String letteraC = convertToString(letC);
    
    String[] letD = new String[]{
                " _____   ",
        		    "|  __ \\  ",
                "| |  | | ",
                "| |  | | ",
                "| |__| | ",
                "|_____/  "
        };
    String letteraD = convertToString(letD);
    
    String[] letM = new String[]{
                " __  __  ",
        		    "|  \\/  | ",
                "| \\  / | ",
                "| |\\/| | ",
                "| |  | | ",
                "|_|  |_| "
        };
    String letteraM = convertToString(letM);
    
    String[] letXLIV = new String[]{
        		"__   __    _          _____    __   __ ",   
"\\ \\ / /   | |        |_   _|   \\ \\ / / ",
" \\ V /    | |          | |      \\ V /  ",
"  > <     | |          | |       > <   ",
" / · \\    | |_ _      _| |_     / · \\  ",
"/_/ \\_\\   |______|   |_____|   /_/ \\_\\ "
        };
    String letteraXLIV = convertToString(letXLIV);
    
    String[] letXCIV = new String[]{
                "__   __    _____     _____    __      __",  
"\\ \\ / /   /  ___|   |_   _|   \\ \\    / /",
" \\ V /    | |         | |      \\ \\  / / ",
"  > <     | |         | |       \\ \\/ /  ",
" / · \\    | |___     _| |_       \\  /   ",
"/_/ \\_\\   \\_____|   |_____|       \\/    "
        };
    String letteraXCIV = convertToString(letXCIV);
    
    String[] letCXXIII = new String[]{
                " _____    __   __   __   __    _____     _____     _____",    
"/  ___|   \\ \\ / /   \\ \\ / /   |_   _|   |_   _|   |_   _|  ",  
"| |        \\ V /     \\ V /      | |       | |       | |   ",
"| |         > <       > <       | |       | |       | |   ",
"| |___     / · \\     / · \\     _| |_     _| |_     _| |_  ",
"\\_____|   /_/ \\_\\   /_/ \\_\\   |_____|   |_____|   |_____| "
        };
    String letteraCXXIII = convertToString(letCXXIII);
    
    String[] letCCLIX = new String[]{
                " _____     _____     _          _____    __   __ ",  
"/  ___|   /  ___|   | |        |_   _|   \\ \\ / / ",
"| |       | |       | |          | |      \\ V /  ",
"| |       | |       | |          | |       > <   ",
"| |___    | |___    | |_ _      _| |_     / · \\  ",
"\\_____|   \\_____|   |______|   |_____|   /_/ \\_\\ "
        };
    String letteraCCLIX = convertToString(letCCLIX);
    
    String[] letCDLXVIII = new String[]{
                " _____     _____      _         __   __   __      __   _____     _____     _____ ",   
"/  ___|   |  __ \\    | |        \\ \\ / /   \\ \\    / /  |_   _|   |_   _|   |_   _|   ",
"| |       | |  | |   | |         \\ V /     \\ \\  / /     | |       | |       | |     ",
"| |       | |  | |   | |          > <       \\ \\/ /      | |       | |       | |     ",
"| |___    | |__| |   | |_ _      / · \\       \\  /      _| |_     _| |_     _| |_    ",
"\\_____|   |_____/    |______|   /_/ \\_\\       \\/      |_____|   |_____|   |_____|   "
        };
    String letteraCDLXVIII = convertToString(letCDLXVIII);
    
    String[] letDLXXXVII = new String[]{
                " _____      _         __   __   __   __   __   __   __      __   _____     _____ ",   
"|  __ \\    | |        \\ \\ / /   \\ \\ / /   \\ \\ / /   \\ \\    / /  |_   _|   |_   _|   ",
"| |  | |   | |         \\ V /     \\ V /     \\ V /     \\ \\  / /     | |       | |     ",
"| |  | |   | |          > <       > <       > <       \\ \\/ /      | |       | |     ",
"| |__| |   | |_ _      / · \\     / · \\     / · \\       \\  /      _| |_     _| |_    ",
"|_____/    |______|   /_/ \\_\\   /_/ \\_\\   /_/ \\_\\       \\/      |_____|   |_____|   "
        };
    String letteraDLXXXVII = convertToString(letDLXXXVII);
    
    String[] letDCCXXXVI = new String[]{
                " _____      _____     _____    __   __   __   __   __   __   __      __   _____ ",   
"|  __ \\    /  ___|   /  ___|   \\ \\ / /   \\ \\ / /   \\ \\ / /   \\ \\    / /  |_   _|   ",
"| |  | |   | |       | |        \\ V /     \\ V /     \\ V /     \\ \\  / /     | |   ",  
"| |  | |   | |       | |         > <       > <       > <       \\ \\/ /      | |     ",
"| |__| |   | |___    | |___     / · \\     / · \\     / · \\       \\  /      _| |_    ",
"|_____/    \\_____|   \\_____|   /_/ \\_\\   /_/ \\_\\   /_/ \\_\\       \\/      |_____|   "
        };
    String letteraDCCXXXVI = convertToString(letDCCXXXVI);
    
    String[] letCMLIV = new String[]{
                " _____     __  __     _          _____    __      __ ",  
"/  ___|   |  \\/  |   | |        |_   _|   \\ \\    / / ",
"| |       | \\  / |   | |          | |      \\ \\  / / ",
"| |       | |\\/| |   | |          | |       \\ \\/ /  ",
"| |___    | |  | |   | |_ _      _| |_       \\  /   ",
"\\_____|   |_|  |_|   |______|   |_____|       \\/    "
        };
    String letteraCMLIV = convertToString(letCMLIV);


    
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


