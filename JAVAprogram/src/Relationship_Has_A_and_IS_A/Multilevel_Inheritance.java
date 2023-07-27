package Relationship_Has_A_and_IS_A;

class Account
{
	long acno=123456;
	String name="Ajay";
}

class SavingAccount extends Account
{
	double bal=4000;
	double mbal=500000;
}
class LoanAccount extends SavingAccount
{
	double lamt=40000;
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		System.out.println("Wlcome to Bank");
		Account a=new Account();
		System.out.println(a.acno);
		System.out.println(a.name);
		
		SavingAccount sa=new SavingAccount();
		System.out.println(sa.name);
		System.out.println(sa.bal);
		System.out.println(sa.mbal);
		
		LoanAccount la=new LoanAccount();
		System.out.println(la.name);
		System.out.println(la.lamt);
		System.out.println(la.bal);
	}

}
