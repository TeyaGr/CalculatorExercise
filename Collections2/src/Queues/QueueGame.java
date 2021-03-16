package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueGame {

	
	public static void main(String[] args) {
		
		Queue<String> first= new LinkedList<String>();
		Queue<String> second = new LinkedList<String>();
		Queue<Integer> result = new LinkedList<Integer>();
first.add("R1");
first.add("T1");
first.add("R1");
first.add("V1");
first.add("R1");
first.add("R1");

second.add("R2");
second.add("T2");
second.add("E2");
second.add("R2");
second.add("R2");
	}
}
