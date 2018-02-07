package training.lab61;

//Finds out your network address when 
//you're connected to the Internet. 
import java.net.*;

public class WhoAmI {
	public static void main(String[] args) throws Exception {
		InetAddress a = InetAddress.getByName("localhost");
		System.out.println(a);
	}
}
