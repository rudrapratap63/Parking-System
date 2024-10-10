/*
This class is used to store studentId as well as username and contact and used tp
know the role of User.
Contributors -> Ojas Joshi
 */
public class Student extends User {
    String studentId;
    Student(String name, String contact, String studentId) {
        super(name, contact);
        this.studentId = studentId;
    }
    public String getRole() {
        return "Student";
    }
}