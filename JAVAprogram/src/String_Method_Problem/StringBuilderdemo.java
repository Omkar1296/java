package String_Method_Problem;

//StringBuider is mutable/changeble
//StringBuilder is non synchronised
//problem from StringBuffer is solve in java JDK 1.5 as using StringBuilder
//it consist of same method from StringBuffer

public class StringBuilderdemo {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("omkar");
		StringBuilder sb2=new StringBuilder("omkar");
		System.out.println(sb1.equals(sb2));         //not override method of equals from object class
		System.out.println(sb1.capacity());
		System.out.println(sb2.length());

	}

}
