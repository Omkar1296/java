package Data_Hiding_Encapsulation;
//Encapsulation ---The process of binding data member(variables) and actions(methods) together is called as Encapsulation.
//1---It is achieved by providing private acess to variables. 2--by providing Getters and Setters to methods.
//Data Hiding-----The process restricting direct access to data members of object and providing controlled access via Actions(methods) of same object.

public class ADriver {

	public static void main(String[] args) {
		System.out.println("Wlcome to Bank..");
		Account a=new Account();
		a.setName("Omkar");
		a.setAccountNo(1245623522);
		a.setPin(1122);
		a.setBal(20000.55);
		
		System.out.println("Account balance is:"+a.getBal());
		a.deposite(10000);
		System.out.println("Account balance is:"+a.getBal());
		a.wihhdraw(5000,1122);
		System.out.println("Account balance is:"+a.getBal());

	}

}
