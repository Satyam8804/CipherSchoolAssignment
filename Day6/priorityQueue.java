// package Day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        //PriorityQueue
        // PriorityQueue is Derived from Queue Interface.
        // PriorityQueue is used when we want to Process Elements by their Priority.
        // It doesn't accepts Null as Element.

        PriorityQueue<String> customerComplaints = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.println("Type your Complaints !!!");
            String text = br.readLine();
            customerComplaints.add(text);
            
        }

        System.out.println(" First Complaints Registered was " + customerComplaints.element());

        System.out.println("First Complaint Again " + customerComplaints.peek());

        // Element & Peek both return the first element of Queue
        // Difference : .element() throws error/exception if the queue is empty

        // . peek() returns null if the queue is empty.

        System.out.println("De- Register the first complaint " + customerComplaints.remove());

        System.out.println("Total comPlaints we are left with " + customerComplaints.size());

        while (customerComplaints.size()>0) {
            System.out.println("Closing Complaints , Current is - " + customerComplaints.poll());
        }
        System.out.println("Total Compliant Count " + customerComplaints.size());
    }
}
