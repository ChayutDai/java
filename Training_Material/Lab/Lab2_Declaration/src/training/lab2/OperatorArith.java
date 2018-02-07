package training.lab2;

class OperatorArith {
	public static void main(String args[]) {
		int a = 9;
		int b = 8;
		
		System.out.println("a      = " + Integer.toBinaryString(a) ); ;
		System.out.println("b      = " + Integer.toBinaryString(b) ); ;
		System.out.println("a&b    = " + Integer.toBinaryString(a&b) ); ;
		System.out.println("a|b    = " + Integer.toBinaryString(a|b) ); ;
		System.out.println("a^b    = " + Integer.toBinaryString(a^b) ); ;
		System.out.println("a >> 4 = " + Integer.toBinaryString(a>>4) ); ;
		System.out.println("a << 4 = " + Integer.toBinaryString(a<<4) ); ;
		System.out.println("~a     = " + Integer.toBinaryString(~a) ); ;
		System.out.println("-a     = " + Integer.toBinaryString(-a) ); ;
	}
}
