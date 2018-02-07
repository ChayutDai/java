package training.lab5.string;
// Ex7036.java
class TestConcat {
	public static void main(String args[]) {
		String a = new String("Hello!");
		String b = new String(" how do you do?");
		a.concat(b);
		System.out.println(a);
		a = a.concat(b);
		System.out.println(a);
	}
}