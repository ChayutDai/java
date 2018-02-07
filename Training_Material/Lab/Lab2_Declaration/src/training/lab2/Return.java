package training.lab2;
// Return.java
class Return {
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			if (i == 3)
				return;
			System.out.println(i);
		}
		System.out.println("End");
	}
}

