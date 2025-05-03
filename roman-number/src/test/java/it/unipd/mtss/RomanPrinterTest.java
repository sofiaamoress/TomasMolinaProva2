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

    @Test
    public void testPrint() {
        assertEquals(" _____    
|_   _|   
  | |     
  | |     
 _| |_    
|_____|   
", RomanPrinter.print(1));
        assertEquals("__      __  
\ \    / /  
 \ \  / /   
  \ \/ /    
   \  /     
    \/      
", RomanPrinter.print(5));
        assertEquals("__   __   
\ \ / /   
 \ V /    
  > <     
 / · \    
/_/ \_\   
", RomanPrinter.print(10));
        assertEquals(" _         
| |        
| |        
| |        
| |_ _     
|______|   
", RomanPrinter.print(50));
        assertEquals(" _____    
/  ___|   
| |       
| |       
| |___    
\_____|   
", RomanPrinter.print(100));
        assertEquals(" _____     
|  __ \    
| |  | |   
| |  | |   
| |__| |   
|_____/    
", RomanPrinter.print(500));
        assertEquals(" __  __    
|  \/  |   
| \  / |   
| |\/| |   
| |  | |   
|_|  |_|   
", RomanPrinter.print(1000));
        assertEquals("__   __    _          _____    __   __   
\ \ / /   | |        |_   _|   \ \ / /   
 \ V /    | |          | |      \ V /    
  > <     | |          | |       > <     
 / · \    | |_ _      _| |_     / · \    
/_/ \_\   |______|   |_____|   /_/ \_\   
", RomanPrinter.print(49));
        assertEquals("__   __    _____     _____    __      __  
\ \ / /   /  ___|   |_   _|   \ \    / /  
 \ V /    | |         | |      \ \  / /   
  > <     | |         | |       \ \/ /    
 / · \    | |___     _| |_       \  /     
/_/ \_\   \_____|   |_____|       \/      
", RomanPrinter.print(94));
        assertEquals(" _____    __   __   __   __    _____     _____     _____    
/  ___|   \ \ / /   \ \ / /   |_   _|   |_   _|   |_   _|   
| |        \ V /     \ V /      | |       | |       | |     
| |         > <       > <       | |       | |       | |     
| |___     / · \     / · \     _| |_     _| |_     _| |_    
\_____|   /_/ \_\   /_/ \_\   |_____|   |_____|   |_____|   
", RomanPrinter.print(123));
        assertEquals(" _____     _____     _          _____    __   __   
/  ___|   /  ___|   | |        |_   _|   \ \ / /   
| |       | |       | |          | |      \ V /    
| |       | |       | |          | |       > <     
| |___    | |___    | |_ _      _| |_     / · \    
\_____|   \_____|   |______|   |_____|   /_/ \_\   
", RomanPrinter.print(259));
        assertEquals(" _____     _____      _         __   __   __      __   _____     _____     _____    
/  ___|   |  __ \    | |        \ \ / /   \ \    / /  |_   _|   |_   _|   |_   _|   
| |       | |  | |   | |         \ V /     \ \  / /     | |       | |       | |     
| |       | |  | |   | |          > <       \ \/ /      | |       | |       | |     
| |___    | |__| |   | |_ _      / · \       \  /      _| |_     _| |_     _| |_    
\_____|   |_____/    |______|   /_/ \_\       \/      |_____|   |_____|   |_____|   
", RomanPrinter.print(468));
        assertEquals(" _____      _         __   __   __   __   __   __   __      __   _____     _____    
|  __ \    | |        \ \ / /   \ \ / /   \ \ / /   \ \    / /  |_   _|   |_   _|   
| |  | |   | |         \ V /     \ V /     \ V /     \ \  / /     | |       | |     
| |  | |   | |          > <       > <       > <       \ \/ /      | |       | |     
| |__| |   | |_ _      / · \     / · \     / · \       \  /      _| |_     _| |_    
|_____/    |______|   /_/ \_\   /_/ \_\   /_/ \_\       \/      |_____|   |_____|   
", RomanPrinter.print(587));
        assertEquals(" _____      _____     _____    __   __   __   __   __   __   __      __   _____    
|  __ \    /  ___|   /  ___|   \ \ / /   \ \ / /   \ \ / /   \ \    / /  |_   _|   
| |  | |   | |       | |        \ V /     \ V /     \ V /     \ \  / /     | |     
| |  | |   | |       | |         > <       > <       > <       \ \/ /      | |     
| |__| |   | |___    | |___     / · \     / · \     / · \       \  /      _| |_    
|_____/    \_____|   \_____|   /_/ \_\   /_/ \_\   /_/ \_\       \/      |_____|   
", RomanPrinter.print(736));
        assertEquals(" _____     __  __     _          _____    __      __  
/  ___|   |  \/  |   | |        |_   _|   \ \    / /  
| |       | \  / |   | |          | |      \ \  / /   
| |       | |\/| |   | |          | |       \ \/ /    
| |___    | |  | |   | |_ _      _| |_       \  /     
\_____|   |_|  |_|   |______|   |_____|       \/      
", RomanPrinter.print(954));
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

