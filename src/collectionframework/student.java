package src.collectionframework;

import java.util.Comparator;

class asc implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class desc implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}
class sortbyname implements Comparator<student>
{

    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class student implements Comparable<student> {
    public student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    Integer id;
    String name;
//using this compareto we can sort either by id or name at a time.So we are going for seperate class
// implementation for sorting.
    @Override
    public int compareTo(student o) {
        return CharSequence.compare(this.name, o.name);
    }
}
   // @Override
    /*
        public int compareTo(student s) {
        return Integer.compare(this.id,s.id );
        }
        */

