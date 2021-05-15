package testpackage;

public class AccountHolder
{
	//public static final String EligibilityForCreditCard = null;
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibleForCreditCard;

	public void testEligibilityForCreditCard()
	{
		if(age>25 && accountBalance>=20000)
		{
			eligibleForCreditCard=true;
		}
		else {
			System.out.println("Try Next Time");
		}

	}

}
