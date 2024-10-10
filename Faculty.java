/*
This is an abstract class serving 2 others classes, used to store id, contact, and name
of the User
Contributors -> Ojas Joshi
 */
class Faculty extends User{
    String facultyId;
    Faculty(String name,String contact,String facultyId){
        super(name,contact);
        this.facultyId = facultyId;
    }
   public String getRole(){
       return "Faculty" ;
   }

}

