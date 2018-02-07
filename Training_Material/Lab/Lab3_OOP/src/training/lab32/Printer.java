package training.lab32;

public class Printer {
	
	String brand;
	String colorMode;

	public Printer() {
		super();
	}
	
	public Printer(String brand, String colorMode) {
		super();
		this.brand = brand;
		this.colorMode = colorMode;
	}

	public String print( String text ){
		System.out.println( text );
		return "success";
	}
	
	public String print( int number ){
		System.out.println( number );
		return "success";
	}
}
