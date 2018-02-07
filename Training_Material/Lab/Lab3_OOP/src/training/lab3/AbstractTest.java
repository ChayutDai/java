package training.lab3;
// AbstractTest.java
abstract class A {
	abstract public void f();
	public void g() { System.out.println("g"); }
}
class B extends A {
	public void f() { System.out.println("f"); }
}
class AbstractTest {
	static void t(A a) { a.f(); a.g(); }
	public static void main(String args[]) {
		t(new B());
	}
}
