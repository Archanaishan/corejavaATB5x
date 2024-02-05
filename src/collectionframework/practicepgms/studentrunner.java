package src.collectionframework.practicepgms;

import java.util.*;

public class studentrunner {
    public static void main(String[] args) {
        student s1=new student(1,"Archana","archana@gmail.com",948660136);
        student s2=new student(2,"Ishan","archan@gmail.com",918660136);
        student s3=new student(3,"Vivaan","archa@gmail.com",928660136);
        student s4=new student(4,"Prasanna","arch@gmail.com",938660136);
        student s5=new student(5,"AVIP","arana@gmail.com",958660136);
        List <student> stu1=new ArrayList<>();
        stu1.add(s1);
        stu1.add(s2);
        stu1.add(s3);
        //Batch1
        List <student> stu2=new ArrayList<>();
        stu2.add(s4);
        stu2.add(s5);
        //Batch2
        Map<String,List<student>>atbbatch=new TreeMap<>();
        atbbatch.put("atbbatch1",stu1);
        atbbatch.put("atbbatch2",stu2);
        Map<String,List<student>>mtbbatch=new TreeMap<>();
        mtbbatch.put("mtbbatch1",stu1);
        mtbbatch.put("mtbbatch2",stu2);
        Map<String,Map<String,List<student>>>courses=new TreeMap<>();
        courses.put("Automation",atbbatch);
        courses.put("Manual",mtbbatch);
        Set<String >coursenames=courses.keySet();
        System.out.println(coursenames);

    }
}

