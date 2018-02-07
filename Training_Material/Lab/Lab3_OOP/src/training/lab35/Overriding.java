package training.lab35;
// Overriding.java
class A { void print() { System.out.print('A'); } }
class B extends A { void print() { System.out.print('B');} }
class Overriding {
	public static void main(String args[]) {
		new B().print();
	}
}
