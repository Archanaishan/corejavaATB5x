package src.collectionframework.practicepgms;

public class student {
    public student() {
    }

    public student(Integer sid, String sname, String email, long phone) {
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }

    private Integer sid;
    private String sname;

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }

    private String email;
    private long phone;

}
