package training.lab2;
// If2.java
class If2 {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if (b == 0)
			System.out.println("Error: divide by zero!");
		else
			System.out.println(a / b);
	}
}

