package src.collectionframework.queue1.example;

public class student implements Comparable<student> {
    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coursename='" + coursename + '\'' +
                '}';
    }

    public student(Integer id, String name, String coursename) {
        this.id = id;
        this.name = name;
        this.coursename = coursename;
    }

    private Integer id;
    private String name;

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

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    private  String coursename;

    @Override
    public int compareTo(student o) {
        return Integer.compare(this.id,o.id);
    }
}
