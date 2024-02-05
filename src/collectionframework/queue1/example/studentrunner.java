package src.collectionframework.queue1.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class studentrunner {
    public static void main(String[] args) {
        student s1= new student(1,"Archana","java automation engineer");
        student s2=new student(2,"Archana Devi","Senior automation QA");
        Queue<student>q=new PriorityQueue<>();
        q.add(s1);
        q.add(s2);
        System.out.println(q);
    }
}
