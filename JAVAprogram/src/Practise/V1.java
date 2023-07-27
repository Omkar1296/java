package Practise;

public class V1 {
	static int a=10;  // global or instance variable

	public static void main(String[] args) {
		{
			int a=25;                    //local variable
			System.out.println(a);
		}
		System.out.println(a);
		

	}

}
