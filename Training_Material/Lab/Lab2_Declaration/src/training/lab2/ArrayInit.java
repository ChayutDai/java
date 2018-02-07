package training.lab2;
// ArrayInit.java
// using class Student from Student.java
class ArrayInit {
	public static void main(String args[]) {
		int[] i = {1, 2, 3, 5, 7, 7+4};
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String[] m = {"How", "do", "you", "do?"};
		
		Student[] studentArr1 = { new Student(), new Student(), new Student()};
		
		Student[] studentArr2 = new Student[3];
		studentArr2[0] = new Student();
		studentArr2[1] = new Student();
		studentArr2[2] = new Student();
	}
}
