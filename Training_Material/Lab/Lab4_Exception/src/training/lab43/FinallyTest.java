package training.lab43;
// FinallyTest.java
class FinallyTest {
	public static void main(String args[]) {
		for (int i = 0; i < 4 ; i++) {
			try {
				System.out.println(i);
				if (i == 0)
					throw new Exception();
				else if (i == 2)
					break;
					// continue;	
			} catch (Exception e) {
				System.out.println("catch");
			} finally {
				System.out.println("finally");
			}
			System.out.println("end try");
		}
		System.out.println("end main");
	}
}
