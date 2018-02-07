package training.lab2;
// ShortCircuit.java
class OperatorLogicalShortCircuit {
	public static void main(String args[]) {
		int x = 0;
		System.out.println(x != 0 && (10 / x) > 1);
		System.out.println(x == 0 || (10 / x) > 1);
	}
}

