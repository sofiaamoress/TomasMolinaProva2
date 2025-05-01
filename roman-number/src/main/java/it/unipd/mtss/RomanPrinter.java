package it.unipd.mtss;

public class RomanPrinter {
  public static String print(int num){
	return printAsciiArt(IntegerToRoman.convert(num));
  }

private static final Map<Character, String[]> asciiMap = new HashMap<>();
    private static final int LINE_COUNT = 6; 
    private static final int MAX_WIDTH = 8; 
    static {
        asciiMap.put('I', new String[]{
        		    " _____  ",
                "|_   _| ",
                "  | |   ",
                "  | |   ",
                " _| |_  ",
                "|_____| "
        });
        asciiMap.put('V', new String[]{
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    "
        });
        asciiMap.put('X', new String[]{
                "__   __",
                "\\ \\ / /",
                " \\ V /  ",
                "  > <   ",
                " / · \\  ",
                "/_/ \\_\\"
        });
        asciiMap.put('L', new String[]{
                " _       ",
        		    "| |      ",
                "| |      ",
                "| |      ",
                "| |_ _   ",
                "|______| "
        });
        asciiMap.put('C', new String[]{
                " _____  ",
        		    "/  ___| ",
                "| |     ",
                "| |     ",
                "| |___  ",
                "\\_____| "
        });
        asciiMap.put('D', new String[]{
                " _____   ",
        		    "|  __ \\  ",
                "| |  | | ",
                "| |  | | ",
                "| |__| | ",
                "|_____/  "
        });
        asciiMap.put('M', new String[]{
                " __  __  ",
        		    "|  \\/  | ",
                "| \\  / | ",
                "| |\\/| | ",
                "| |  | | ",
                "|_|  |_| "
        });
    }

  private static String printAsciiArt(String romanNumber){
	StringBuilder[] lines = new StringBuilder[LINE_COUNT];
        for (int i = 0; i < LINE_COUNT; i++) {
            lines[i] = new StringBuilder();
        }

        for (char c : roman.toCharArray()) {
            String[] ascii = asciiMap.get(c);
            if (ascii != null) {
                for (int i = 0; i < LINE_COUNT; i++) {
                    lines[i].append(String.format("%-" + MAX_WIDTH + "s", ascii[i])).append("  "); 
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder line : lines) {
            result.append(line.toString()).append("\n");
        }

        return result.toString();
  }

}