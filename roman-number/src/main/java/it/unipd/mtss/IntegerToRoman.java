package it.unipd.mtss;

public class IntegerToRoman {

  public static String convert(int number){
	//errori
	if (number > 1000 || number < 0){
		throw new IllegalArgumentException("Number not in range. Admitted range: [0,1000]")
	}

	int unit = number % 10;
	int dec = (number/10) % 10;
	int cen = (number/100) % 10;
	int mil = number/1000;

	return thousands(mil) + hundreds(cen) + tens(dec) + units(unit);
  }

  private static String units(int number){
	  if (number > 9 || number < 0){
		throw new IllegalArgumentException("Number not in range. Admitted range: [0,9]")
	  }

	  switch (number){
		  case 0:
			return "";
		  case 1:
			return "I";
		  case 2:
			return "II";
		  case 3:
			return "III";
		  case 4:
			return "IV";
		  case 5:
			return "V";
		  case 6:
			return "VI";
		  case 7:
			return "VII";
		  case 8:
			return "VIII";
		  case 9:
			return "IX";
		  default:
			return "";

	  }

  }

  private static String tens(int number){
	  if (number > 9 || number < 0){
		throw new IllegalArgumentException("Number not in range. Admitted range: [0,9]")
	  }

	  switch (number){
		  case 0:
			return "";
		  case 1:
			return "X";
		  case 2:
			return "XX";
		  case 3:
			return "XXX";
		  case 4:
			return "XL";
		  case 5:
			return "L";
		  case 6:
			return "LX";
		  case 7:
			return "LXX";
		  case 8:
			return "LXXX";
		  case 9:
			return "XC";
		  default:
			return "";
	  }
  }

  private static String hundreds(int number){
	  if (number > 9 || number < 0){
		throw new IllegalArgumentException("Number not in range. Admitted range: [0,9]")
	  }

	  switch (number){
		  case 0:
			return "";
		  case 1:
			return "C";
		  case 2:
			return "CC";
		  case 3:
			return "CCC";
		  case 4:
			return "CD";
		  case 5:
			return "D";
		  case 6:
			return "DC";
		  case 7:
			return "DCC";
		  case 8:
			return "DCCC";
		  case 9:
			return "CM";
		  default:
			return "";
	  }
  }

  private static String thousands(int number){
	  if (number > 1 || number < 0){
		throw new IllegalArgumentException("Number not in range. Admitted range: [0,1]")
	  }

	  if (number == 1){
		  return "M";
	  }
	  return "";
  }

}
