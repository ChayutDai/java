package training.lab2;
// Continue1.java
class Continue1 {
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			if (i == 3)
				continue;
			System.out.println(i);
		}
		System.out.println("End");
	}
}
