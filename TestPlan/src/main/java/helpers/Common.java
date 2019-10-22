package helpers;

import java.util.Random;

public class Common {
	
	//Print a message in console
	public static void printConsole(String Message) {
		System.out.println(Message);
	}
	
	//Verify if two integer values are equal
	public static Boolean AssertEqualsInteger(Integer expected, Integer currentValue){
		Boolean equals;
		if (expected.equals(currentValue)) {
			equals= true;
		}else {
			equals = false;			
		}
		return equals;
	}
	
	//Get last account id (use a random)
	public static Integer getLastAccountId() {
		return generateRandom();
	}
	
	//Get an account balance (use a random)
	public static Integer getAccountBalance() {
		return generateRandom();
	}
	
	//Generate a random Integer -between 0 and 10.000-
	public static Integer generateRandom() {
		Random random = new Random();
	    return random.ints(0,10000).findFirst().getAsInt();
	}
	
	//Validate if the value is an integer.
	public static Boolean validateInteger(String value) {
		try
	    {
	        Integer.parseInt(value);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	    	return false;
	    }
	}

}
