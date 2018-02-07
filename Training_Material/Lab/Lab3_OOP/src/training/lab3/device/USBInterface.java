package training.lab3.device;

public interface USBInterface {
	static final String interfaceCode = "USB";
	abstract String execute( String input );
}
