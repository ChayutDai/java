package training.lab2;
// If3.java
class If3 {
	public static void main(String args[]) {
		int s = Integer.parseInt(args[0]);
		if (s >= 85)
			System.out.println('A');
		else if (s >= 75)
			System.out.println('B');
		else if (s >= 65)
			System.out.println('C');
		else if (s >= 55)
			System.out.println('D');
		else
			System.out.println('F');
	}
}

