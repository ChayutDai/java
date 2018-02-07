package training.lab33;

public class PrinterWithModifier {
	
	private String brand;
	private String colorMode;

	public PrinterWithModifier() {
		super();
	}
	
	public PrinterWithModifier(String brand, String colorMode) {
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
