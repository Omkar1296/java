package String_Method_Problem;

//String is non primitive data type and string is class its also cocsist of sequence of char(or Array of char)
//String object is created in heap area and alsoin String constant pool area which in heap area
//String are immutable i.e. unchangable once String object is created in heap area we can't do any changes in this object 
//to do any changes we create another object ie String s="rohan"  and we want to chnage the name as rohan roy so we crate another object as rohan roy
//Why String is final i.e.public final class String extends object (class) implements charSequnce(Searilizable and comparable)
//Create String we have three classes 1.String  2.StringBuffer  3.StringBuilder
//String object present in scp are not applicable for garbage collection becpz refernce variable is maintained by JVM
//Why String is final?  ans: String class has got special feature which is not avaliable to other java classes and making the String class final prevent that could break this assumption
//String has many constructor and methods
//"==" it is used to compare address
//"equals" it is uesd to compare contain

public class String1 {

	public static void main(String[] args) {
		String s1=new String("Rakesh");
		String s2=new String("Rakesh");
		System.out.println(s1==s2);  //false
		System.out.println(s1.equals(s2));  //true
		
		String s3="amar";
		String s4="amar";
		String s5="Amar";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s5));

	}

}
