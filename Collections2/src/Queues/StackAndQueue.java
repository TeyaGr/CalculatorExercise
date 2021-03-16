package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
public static void main(String[] args) {
	
	Stack<Integer> s =new Stack<Integer>();
	Queue<Integer> q=new LinkedList<Integer>();
	
	q.add(1);
	q.add(2);
	q.add(3);
	while(!q.isEmpty()) {
		s.push(q.poll());
	}
	System.out.println(s);
	while(!s.isEmpty()) {
		System.out.println(s.pop());
	}
}
}
