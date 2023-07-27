package Non_Static;

public class DDriver {

	public static void main(String[] args) {
		System.out.println("Welcome to the Furniture Shop...");
		Door d=new Door();
		d.colour="red";
		d.size=50*50;
		d.material="Wood";
		d.price=2500;
		d.details();
		
		System.out.println();
		
		Door d1=new Door();
		d1.colour="Yellow";
		d1.size=2546;
		d1.material="Fiber";
		d1.price=3000;
		d1.details();

	}

}
