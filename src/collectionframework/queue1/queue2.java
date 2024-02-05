package src.collectionframework.queue1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue2 {
    public static void main(String[] args) {
        Queue p=new PriorityQueue();
        p.add(232);
        p.add(90);
        p.add(89);
        System.out.println(p);
        p.poll();//Removes the first value in the queue
        System.out.println(p);
        System.out.println(p.peek());// display the top element.
        Iterator iterator=p.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
