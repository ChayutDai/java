package training.lab3;

import training.lab3.device.PrinterUSBImpl;
import training.lab3.device.USBInterface;

public class NotebookWithUSB {
	String color = "Black";
	String brand = "HP";
	
	USBInterface usb;
	
	public void setUsb(USBInterface usb) {
		this.usb = usb;
	}
	
	void execute( String text ){
		usb.execute(text);
	}
	
	void start(){
		System.out.println("Notebook is started");
	}
	
	void shutdown(){
		System.out.println("Notebook is shutdowm");
	}
	
	public static void main(String[] args) {
		NotebookWithUSB nb = new NotebookWithUSB();
		nb.start();
		nb.setUsb( new PrinterUSBImpl() );
		nb.execute("Test Printing");
		nb.shutdown();
	}
}
