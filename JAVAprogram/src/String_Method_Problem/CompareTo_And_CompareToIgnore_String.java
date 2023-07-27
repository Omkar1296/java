package String_Method_Problem;

public class CompareTo_And_CompareToIgnore_String {

	public static void main(String[] args) {
		String s1="a";   //97
		String s2="A";   //65
		String s3="a";
		System.out.println(s1.compareTo(s2));    //compareTo give int value i.e. unicode value of a And A is 65 and 97...so will get substrction
		System.out.println(s1.compareTo(s3));      //0
		System.out.println(s2.compareTo(s3));         //-32
		System.out.println(s1.compareToIgnoreCase(s2));  //it ignore unicode value of a and A take same value as other
	}

}
