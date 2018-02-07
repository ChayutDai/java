package training.lab2;
// If1.java
class If1 {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if (b == 0) {
			System.out.println("Error: divide by zero!");
			System.exit(0);
		}
		System.out.println(a / b);
	}
}
