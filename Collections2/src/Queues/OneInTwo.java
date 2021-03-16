package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class OneInTwo {

	public static void main(String[] args) {
				Queue<Integer> odd = new LinkedList<Integer>();
		Queue<Integer>even = new LinkedList<Integer>();
		Queue<Integer> main = new LinkedList<Integer>();
		for (int i = 1; i <20; i++) {
			main.add(i);
			
		}
		System.out.println(main);
		for(Integer i:main) {
			if(i%2==0) {
				even.add(i);
			}else {
				odd.add(i);
			}
		
		}

System.out.println(odd);
			System.out.println(even);
	}	
		
}

