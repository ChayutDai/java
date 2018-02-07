package training.lab2;
// Break3.java
class Break3 {
	public static void main(String args[]) {
	first: for (int i = 0; i < 3; i++)
		second: for (int j = 0; j < 3; j++) {
			if (i == 1 && j == 1)
				break first;
			System.out.println(i + "," + j);
		}
		System.out.println("End");
	}
}

