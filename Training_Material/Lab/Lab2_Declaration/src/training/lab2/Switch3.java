package training.lab2;
// Switch3.java
class Switch3 {
	public static void main(String args[]) {
		char g = args[0].charAt(0);
		switch(g) {
		case 'A':
		case 'B':
		case 'C': System.out.println("Passes"); break;
		case 'D':
		case 'F': System.out.println("Fails"); break;
		default : System.out.println("Invalid");
		}
	}
}
