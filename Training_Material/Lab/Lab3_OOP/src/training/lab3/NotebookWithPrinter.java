package training.lab3;

import training.lab3.device.Printer;

public class NotebookWithPrinter {
	String color = "Black";
	String brand = "HP";
	
	Printer printer;
	
	void start(){
		System.out.println("Notebook is started");
	}
	
	void shutdown(){
		System.out.println("Notebook is shutdowm");
	}
	
	void execute( String text ){
		printer = new Printer();
		printer.print(text);
	}
	
	public static void main(String[] args) {
		NotebookWithPrinter nb = new NotebookWithPrinter();
		nb.start();
		nb.execute("Test Printing");
		nb.shutdown();
	}
}
