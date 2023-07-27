package Data_Hiding_Encapsulation;

public class Accounts {
	private String name;
	private long accountNo;
	private double bal;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAccountNo(long accountNo)
	{
		this.accountNo=accountNo;
	}
	public void setBal(double bal)
	{
		this.bal=bal;
	}
	public String getName()
	{
		return name;
	}
	public long getAccountNo()
	{
		return accountNo;
	}
	public double getBal()
	{
		return bal;
	}
	public void details()
	{
		System.out.println("Account Holder Name is: "+getName());
		System.out.println("Account Holder Number is: "+getAccountNo());
		System.out.println("Account Holder Balance is: "+getBal());
	}
	public void withdraw(int pin,double amt)
	{
		if(pin==1122)
		{
			if(amt<=bal)
			{
				System.out.println("Please collect the cash of Rs. "+amt);
				bal=bal-amt;
			}
			else
			{
				System.out.println("chcek the amount entered..");
			}
		}
		else
		{
			System.out.println("u r entered wrong Pin");
		}
	}
	public void deposite(int pin,double amt)
	{
		if(pin==1122)
		{
			System.out.println("Please enter the cash..");
			bal=amt+bal;
			System.out.println("U r deposited amount of Rs. "+amt+" successfully");
		}
		else
		{
			System.out.println("u r entered wrong Pin");
		}
	}

}
