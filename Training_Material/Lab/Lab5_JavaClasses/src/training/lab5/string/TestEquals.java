package training.lab5.string;
// Ex7037.java
class TestEquals {
	public static void main(String args[]) {
		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c)); 
	}
}