package Method;
//It block of instruction/code uesd to perform specific task
//their are severals parts in that accessModifier, modifer,return type, method name, formal argunment
//method signature ---method name and formal argunment
//method declartion   ---method signature and access modifier,modifier,return type
//method defination ------ method delcration and method body
//thir ar two type no argument method and argunment method

public class M1 {
	
	public static void add()//no argument method
	{
		int a=22;
		int b=58;
		System.out.println("Addition of two is " + (a+b));
	}

	public static void main(String[] args) {
		System.out.println("Addition of Two Number...");
		add();
		

	}

}
