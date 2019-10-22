package testCases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import helpers.Common;
import helpers.Services;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends Services{
	
	Common helperCommon = new Common();
	static String responseBody;
	static Integer accountBalance;
	Integer accountStatus;
	
    @Rule
    public TestName testName = new TestName();
    
	@Before
	public void startTest() {
		System.out.println(testName.getMethodName());
	}
	
	@Test
	public void US01_ID01_RegisterAnAccountForNewCustomers() {
		Boolean newCustomer = true; //Indicates if the customer is new (true) or not (false)
		responseBody = createAccount(newCustomer);
		Assert.assertTrue(helperCommon.validateInteger(responseBody));
	}
	
	@Test
	public void US02_ID02_CloseAnOpenAccountWithMoney() {
		accountStatus=1;//Indicates the current state of the account: 0 (Close) or 1 (Open) or others.
		Integer balance = 500;
		accountStatus = closeAccount(accountStatus, balance);
		Assert.assertTrue(helperCommon.AssertEqualsInteger(1, accountStatus));
	}

	@Test
	public void US03_ID01_WithdrawFundsFromAnAccount() {
		Integer accountBalance = 2000;
		Integer withdrawal = 500;
		Integer newBalance = accountBalance - withdrawal;
		accountBalance = withdrawFunds(accountBalance, withdrawal);
		Assert.assertTrue(helperCommon.AssertEqualsInteger(newBalance, accountBalance));
	}

	@Test
	public void US04_ID02_DepositMoneyFromAnExpiredCreditCard() {
		accountBalance = 1500;
		Integer deposit = 1500;
		Integer creditCardStatus = 1;//Indicates the current state of the credit card: 0 (Valid) or 1 (Expired).
		Integer finalBalance = accountBalance;
		accountBalance = depositMoney(accountBalance,deposit,creditCardStatus);
		Assert.assertTrue(helperCommon.AssertEqualsInteger(finalBalance, accountBalance));
	}
	
	@Test
	public void US05_ID01_SeeTheBalanceOfAnOpenAccount() {
		accountStatus = 1; //Indicates the current state of the account: 0 (Close) or 1 (Open) or others.
		seeBalance(accountStatus);
	}

}
