package src.collectionframework.queue1;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue pq=new PriorityQueue();
        pq.offer(20);
        pq.offer(3);
        pq.offer(45);
        pq.offer(9);
        System.out.println(pq);
        //the values in queue will be automatically sorted in natural order.order in which they are processed
        //we cannot add null values to queue
        //similar to pq.offer we can use pq.add to add elements to the queue
    }
}
