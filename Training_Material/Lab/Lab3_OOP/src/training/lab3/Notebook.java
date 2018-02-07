package training.lab3;

public class Notebook {
	String color = "Black";
	String brand = "HP";
	
	void start(){
		System.out.println("Notebook is started");
	}
	
	void shutdown(){
		System.out.println("Notebook is shutdowm");
	}
	
	public static void main(String[] args) {
		Notebook nb = new Notebook();
		nb.start();
		nb.shutdown();
	}
}
