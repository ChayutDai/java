package training.lab5.wrapper;
// Ex7004.java
class TestParsing {
	public static void main(String args[]) {
		Integer x = new Integer(123);
		System.out.println(x.toString());

		int a = 456;
		System.out.println(Integer.toString(a));
		
		int b = Integer.parseInt("789");
		System.out.println(b);
	}
}