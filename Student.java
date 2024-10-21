/**
  * This class is used to store the student ID, name, and contact information of a student
  * Contributors -> Ojas Joshi
 */
public class Student extends User {
    String id;

    /**
     * Constructs a Student with the specified name, contact information, and student ID.
     *
     * @param name    the name of the student
     * @param contact the contact information of the student
     * @param id      the student ID of the student
     */
    Student(String name, String contact, String id) {
        super(name, contact);
        this.id = id;
    }

    /**
     * Returns the role of the user as a String.
     *
     * @return a String representing the role of the user, which is "Student"
     */
    public String getRole() {
        return Constant.STUDENT;
    }
}