package Static;

public class StudentDriver {
	static int id;

	public static void main(String[] args) {
		id=20;
		School.name="Dinga";
		School.sec='A';
		School.roll=45;
		
		print();
		School.details();
		

	}

	private static void print() {
		System.out.println("Printinggg..");
		
	}

}
