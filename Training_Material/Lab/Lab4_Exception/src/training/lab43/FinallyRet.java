package training.lab43;
// FinallyRet.java
class FinallyRet {
	public static void main(String args[]) {
		try {
			if (args[0].equals("John"))
				return;
			System.out.println("Hello!  "+ args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hello! whoever you are.");
		} finally {
			System.out.println("How are you today?");
		}
		System.out.println("It’s nice to see you.");
	}
}
