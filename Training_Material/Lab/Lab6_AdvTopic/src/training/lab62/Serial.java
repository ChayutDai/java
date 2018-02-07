package training.lab62;

// Serial.java
import java.io.*;
class Serial {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new A());
		oos.close(); 	
		fos.close();
	}
}
