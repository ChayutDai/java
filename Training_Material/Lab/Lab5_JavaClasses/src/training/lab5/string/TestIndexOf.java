package training.lab5.string;
// Ex7043.java
class TestIndexOf {
	public static void main(String args[]) {
		String a = "Hello how do you do?";
		System.out.println(a.indexOf('o'));
		System.out.println(a.lastIndexOf('o'));
		System.out.println(a.indexOf("do"));
		System.out.println(a.lastIndexOf("do"));
		System.out.println(a.indexOf('o', 5));
		System.out.println(a.lastIndexOf('o', 15));
		System.out.println(a.indexOf("do", 11));
		System.out.println(a.lastIndexOf("do", 11));

	}
}