package training.lab2;
// Switch2.java
class Switch2 {
	public static void main(String args[]) {
		char g = args[0].charAt(0);
		switch(g) {
		case 'A': System.out.println("Excellent"); break;
		case 'B': System.out.println("Good"); break;
		case 'C': System.out.println("So so"); break;
		case 'D': System.out.println("Fails"); break;
		case 'F': System.out.println("Get lost"); break;
		default : System.out.println("Invalid");
		}
	}
}
