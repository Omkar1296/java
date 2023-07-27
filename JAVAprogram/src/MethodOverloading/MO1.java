package MethodOverloading;
//It is also called as Polymorphisum
//it consist of one name but different action (or) If class has multiple methods having same method name but different in argument
//their are two ways to overload method in java
//1.by changing no.of argunment 2.By changing the data types 3.sequence of datatypes
//Note: Method overloading is not possible by changing return type of method

public class MO1 {

	public static void main(String[] args) {
		add(10,20.5);

	}

	public static void add(int i, double j) {
		System.out.println(i+j);
		
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}

}
