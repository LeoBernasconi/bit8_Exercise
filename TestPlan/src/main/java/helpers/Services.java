package helpers;

public class Services extends Common {
	
	static String responseBody;
	static String currency = "$";
	
	//Create an account
	public static String createAccount(Boolean newCustomer) {
		 if (newCustomer==true) {
			 responseBody=Integer.toString(getLastAccountId()+1);
		}else {
			responseBody = "The account cannot be created: The user is already registered.";
		}
		printConsole(responseBody);
		return responseBody;
	}
	
	//Close an account
	public static Integer closeAccount(Integer accountStatus,Integer accountBalance) {
		
		if (accountStatus==0) {
			responseBody = "The account cannot be closed: It is already close";
		}else {
			if (accountBalance==0) {
				accountStatus=0;
				responseBody = "The account has been closed.";
			}else {
				responseBody = "The account cannot be closed. The account has money: " + currency + accountBalance;
			}
		}
		printConsole(responseBody);
		return accountStatus;
	}
	
	//Withdraw fund from an account
	public static Integer withdrawFunds(Integer accountBalance,Integer withdrawal) {
		if (withdrawal>accountBalance) {
			printConsole("It is not possible to withdraw " + currency + withdrawal + ".The account has not enough money. Balance: " + currency + accountBalance);
		}else {
			accountBalance = accountBalance - withdrawal;
			printConsole("The new account balance is: " + currency + accountBalance );
		}
		return accountBalance;
	}
	
	//Deposit money into an account
	public static Integer depositMoney(Integer accountBalance, Integer deposit, Integer creditCardStatus) {
		if (creditCardStatus==0) {
			accountBalance = accountBalance + deposit;
			printConsole("The new account balance is " + currency + accountBalance + ".");

		} else {
			printConsole("The deposit is not possible: The credit card is expired.");	
		}
		return accountBalance;
	}
	
	//Show an account balance
	public static void seeBalance(Integer accountStatus) {
		if (accountStatus==1) {
			printConsole("The balance is " + currency + getAccountBalance());
		}else {
			printConsole("The balance is not available. To account must be open.");
		}
	}
	
}
