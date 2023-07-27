package String_Method_Problem;

public class Replace_ReplaceAll_ReplaceFirst_String {

	public static void main(String[] args) {
		String s1="This is a dog";
		System.out.println(s1.replace("dog","cat"));
		System.out.println(s1.replace('i', 't'));
		System.out.println(s1.replaceFirst("is", "ok"));
		System.out.println(s1.replaceAll("is", "was"));
		System.out.println(s1.replaceAll("is(.)", "was"));  //.remove spaces
		System.out.println(s1.replaceAll("is(.*)", "was"));  //.* remove reamining words
	}

}
