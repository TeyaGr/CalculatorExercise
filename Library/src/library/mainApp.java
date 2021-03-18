package library;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class mainApp {
public static void main(String[] args) {
	HashMap<String, String > students = Service.getAllStudentsCredentials();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your username");
	String user = s.next();
	if(students.containsKey(user)) {
		System.out.println("Please enter your password");
		String pass=s.next();
		if(students.get(user).equals(pass)) {
			System.out.println("Confirmed");
			HashMap<Integer, List<Book>> map = Service.getBooks(s);
		System.out.println(map.toString());
		}else {
			System.out.println("Enter a valid password");
		}
	}else {
		System.out.println("Enter a valid username");
	}
	
}
	
}
