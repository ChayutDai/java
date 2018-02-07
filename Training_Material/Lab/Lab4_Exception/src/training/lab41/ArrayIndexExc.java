package training.lab41;
// ArrayIndexExc.java
class ArrayIndexExc {
	public static void main(String args[]) {
		try {
			System.out.println("Hello!  "+ args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hello! whoever you are. ");
		}
		System.out.println("How are you today? ");
	}
}
