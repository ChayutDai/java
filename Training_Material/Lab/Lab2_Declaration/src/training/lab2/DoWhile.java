package training.lab2;
// DoWhile.java
class DoWhile {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		int i = 1, f = 1;
		do {
			f *= i;
		} while (i++ < n);
		System.out.println(n + "! = " + f);
	}
}
