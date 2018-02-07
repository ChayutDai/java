package training.lab3.device;

public class PrinterUSBImpl implements USBInterface {
	
	public String execute(String input) {
		return print(input);
	}
	
	String brand;
	String colorMode;

	public PrinterUSBImpl() {
		super();
	}
	
	public PrinterUSBImpl(String brand, String colorMode) {
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
