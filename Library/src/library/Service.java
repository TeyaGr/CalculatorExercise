package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Service {

	public static HashMap<String, String> getAllStudentsCredentials(){
 HashMap<String, String> map = new HashMap<>();
HashSet<Student> students = getAllStudents();
for(Student s:students) {
 map.put(s.getUser(), s.getPass());
}
 return map;
}
	
	public static HashSet<Student> getAllStudents(){
		
		 Student s1 = new Student("1", "s1", "passs1");
		 Student s2 = new Student("2", "s2", "passs2");
		 Student s3 = new Student("3", "s3", "passs3");
		 Student s4 = new Student("4", "s4", "passs4");
		 Student s5 = new Student("5", "s5", "passs5");
		 
		
		HashSet<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		return set;
		
		
	}
	public HashMap<String, String> getAllEmployeesCredentials(){
 HashMap<String, String> map = new HashMap<>();
 Employee e1= new Employee("email1", "11");
 Employee e2= new Employee("email2", "22");
 Employee e3= new Employee("email3", "33");
 map.put(e1.getEmail(),e1.getEmployeeId());
 map.put(e2.getEmail(),e2.getEmployeeId());
 map.put(e3.getEmail(),e3.getEmployeeId());
 return map;
	}
 public static List<Author> getAllAuthors(){
	 List<Author> list = new ArrayList<>();
	 Author a1= new Author("Love");
	 Author a2= new Author("Crime");
	 Author a3= new Author("Horror");
	 a1.name="Nicholas";
	 a1.lastName="Sparks";
	 a2.name="Agatha";
	 a2.lastName="Christie";
	 a3.name="Sebastian";
	 a3.lastName="Fitzek";
	 list.add(a1);
	 list.add(a2);
	 list.add(a3);
	 return list;
 }
	public static List<Book> getAllBooks(){
		List<Book> list = new ArrayList<Book>();
		Book b1=new Book("The notebook", 10, getAllAuthors().get(0), true);
		Book b2=new Book("Witness for the Prosecution", 15, getAllAuthors().get(1), false);
		Book b3=new Book("Die Therapie", 10, getAllAuthors().get(2), true);
		list.add(b1);
		list.add(b3);
		list.add(b2);
return list;
}

	public static HashMap<Integer, List<Book>> getBooks(Scanner s) {
		List<Book> books = getAllBooks();
		List<Book> booklist = new ArrayList<Book>();
int sum=0;
		System.out.println("How many books would you like?");
		
			int n = s.nextInt();
		while(n>0) {
		System.out.println("Name od the book:");
		s= new Scanner(System.in);
		String book=s.next();
		for(Book b:books) {
			if(b.getTitle().contains(book)) {
				if(b.isAvailable()) {
					booklist.add(b);
					sum+=b.getPrice();
				}
			}
			
		}
		n--;
	}
		
		HashMap<Integer, List<Book>> map= new HashMap<Integer, List<Book>>();
		map.put(sum, booklist);
		return map;
}
}
