public class Student extends User{
        String studentId;
        Student(String name,String contact, String studentId){
        super(name,contact);
        this.studentId = studentId;
        }

public String getRole()
{
        return "Student";
        }

        }