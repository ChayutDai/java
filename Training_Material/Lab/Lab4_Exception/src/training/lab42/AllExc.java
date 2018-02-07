package training.lab42;
// AllExc.java
class AllExc {
	public static void main(String args[]) {
		try {
			int i1 = Integer.parseInt(args[0]);
			int i2 = Integer.parseInt(args[1]);
			System.out.println(i1 / i2);
		} catch (NumberFormatException e) {
			System.out.println("number format");
		} catch (ArithmeticException e) {
			System.out.println("arithmetic");
		} catch (Exception e) {
			System.out.println("all");
		}
	}
}
