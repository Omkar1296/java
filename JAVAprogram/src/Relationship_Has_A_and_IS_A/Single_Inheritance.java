package Relationship_Has_A_and_IS_A;

//IS-A relationship is also called as inheritance.... it is parent and child relationship or blood relationship, tightly coupled
//extends is keyword  with help of this we can access properties of parent class
//class to class extends

class Parent                //Superclass
{
	Parent()
	{
		//execute all Non-static members
		//execute all Non-static block/Initilizer
		//programmer written statement
	}
	int page=52;
	String pname="Rakesh";
}
class Child extends Parent                //Subclass
{
	Child()
	{
		super();
	}
	String cname="rahul";
	int cage=25;
}

public class Single_Inheritance {

	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println(p.pname);
		System.out.println(p.page);
		
		Child c=new Child();
		System.out.println(c.cname);
		System.out.println(c.cage);
		System.out.println(c.pname);
		System.out.println(c.page);
	}

}
