package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Person {

	private String name;
	private String lastname;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Person(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}

	public static void main(String[] args) {
		
		Person p1 = new Person("Tea", "Grombanovska");
		Person p2 = new Person("Martin", "Grombanovski");
		Person p3 = new Person("Sofi", "Hristovska");
		Person p4 = new Person("Petra", "Temelkova");
		Person p5 = new Person("Ina", "Kostovska");
		
		Queue<Person> q = new LinkedList<Person>();
		q.add(p1);
		q.add(p2);
		q.add(p3);
		q.add(p4);
		q.add(p5);
		for(Person p : q) {
							System.out.println(i+" "+p.getName()+ " "+ p.getLastname());
			 
             
		}

	}

}
}
