package training.lab2;
// Continue2.java
class Continue2 {
	public static void main(String args[]) {
		int i = 0;
		while (i < 5) {
			if (i == 3)
				continue;
			System.out.println(i);
			i++;
		}
		System.out.println("End");
	}
}
