package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class firstEx {
public static void main(String[] args) {
	
	Queue<Integer> q= new LinkedList<Integer>();
	q.add(10);
	q.add(20);
	q.add(30);
	q.add(40);
	q.add(50);
	for(Integer i:q) {
		System.out.println(i);
	}
	System.out.println(q);
	while(!q.isEmpty()) {
		System.out.println(q.poll());
	}
	System.out.println(q);
}
}
