package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
public static void main(String[] args) {
	
	String palindrome ="elie";
	Stack<String> s = new Stack<String>();
	Queue<String> q =new LinkedList<String>();
	String[] split = palindrome.split("");
	for(String string:split) {
		s.push(string);
		
	}System.out.println(s);
	while(!s.isEmpty()) {
		q.add(s.pop());
	}
	System.out.println(q);
	String reverse="";
	while(!q.isEmpty()) {
		reverse+=q.poll();
	}
	System.out.println(palindrome.equals(reverse));
}
}
