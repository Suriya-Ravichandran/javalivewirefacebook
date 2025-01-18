package utilpackage;

import java.util.PriorityQueue;
public class pqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PriorityQueue <Integer> pq1 =new  PriorityQueue<>();
		 
		 for(int i=0;i<=5;i++) {
			 pq1.add(i);
		 }
		 
		 System.out.println(pq1);
		 for(int i=0;i<=5;i++) {
			 pq1.poll();
			 System.out.println(pq1);
		 }
	}

}
