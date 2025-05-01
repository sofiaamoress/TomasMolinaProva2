package it.unipd.mtss;

public class IntegerToRoman {

  public static String convert(int number){

	unit = number % 10;
	dec = (number/10) % 10;
	cen = (number/100) % 10;
	mil = number/1000;

	return thousands(mil) + hundreds(cen) + tens(dec) + units(unit);
  }

  private static String units(int number){

  }

  private static String tens(int number){

  }

  private static String hundreds(int number){

  }

  private static String thousands(int number){

  }

}
