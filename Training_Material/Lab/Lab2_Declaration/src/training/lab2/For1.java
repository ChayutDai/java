package training.lab2;
// For1.java
class For1 {
	public static void main(String args[]) {
		int i, f, n = Integer.parseInt(args[0]);
		for (i = 1,f = 1; i <= n; i++)
			f *= i;
		System.out.println(n + "! = " + f);
	}
}

