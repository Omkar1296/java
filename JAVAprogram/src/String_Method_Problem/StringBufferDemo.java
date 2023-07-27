package String_Method_Problem;

//StringBuffer is mutable i.e.changable
//Stringbuffer are synchronised method i.e. thread method

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("omkar");
		StringBuffer sb2=new StringBuffer("omkar");
		
		System.out.println(sb1.equals(sb2));     //String buffer object cant override equals method from object class
		//System.out.println(sb.capacity());
		
		/*sb.append("hello");
		System.out.println(sb.capacity());    //16
		
		sb.append("hello ggggword");      //(old capacity is 16*2)+2
		System.out.println(sb.capacity());
		
		System.out.println(sb.append("ram"));
		System.out.println(sb.length());
		
		System.out.println(sb.delete(3, 6));
		System.out.println(sb.deleteCharAt(3));
		*/
		
		System.out.println(sb2.insert(5, "Raju"));
		System.out.println(sb2.replace(3, 6, "m"));

	}

}
