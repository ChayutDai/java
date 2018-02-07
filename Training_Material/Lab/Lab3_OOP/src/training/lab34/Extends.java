package training.lab34;
// Extends.java
class A {
	int x = 1;
	void printA() { System.out.println("A"); }
}
class B extends A {
	int y = 2;
	void printB() { System.out.println("B"); }
}
class Extends {
	public static void main(String args[]) {
		B b = new B();
		System.out.println(b.x + "," + b.y);
		b.printA(); 
		b.printB();
	}
}


