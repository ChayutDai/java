package training.lab2;
// Switch1.java
class Switch1 {
	public static void main(String args[]) {
		char g = args[0].charAt(0);
		switch(g) {
		case 'A': System.out.println("Excellent");
		case 'B': System.out.println("Good");
		case 'C': System.out.println("So so");
		case 'D': System.out.println("Fails");
		case 'F': System.out.println("Get lost");
		default : System.out.println("Invalid");
		}
	}
}
