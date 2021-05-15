package testpackage;

public class AccountHolderObjects 
{
	public static void main(String[] args) 
	{
		AccountHolder tom= new AccountHolder();
		AccountHolder henry= new AccountHolder();
		AccountHolder sarah= new AccountHolder();
 
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=25;
		tom.accountBalance=30000;
		tom.testEligibilityForCreditCard();
		System.out.println("Is Tom Eligible For Credit Card ?"+tom.eligibleForCreditCard);

	}
}
