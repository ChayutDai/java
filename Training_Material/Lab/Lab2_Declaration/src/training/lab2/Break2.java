package training.lab2;
// Break2.java
class Break2 {
	public static void main(String args[]) {
	here: for (int i = 0; i < 5; i++) {
			if (i == 3)
				break here;
			System.out.println(i);
		}
		System.out.println("End");
	}
}
