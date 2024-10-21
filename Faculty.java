/*
This is an abstract class serving 2 others classes, used to store id, contact, and name
of the User
Contributors -> Ojas Joshi
 */
class Faculty extends User{
    String id;

    /**
     * Constructs a Faculty member with the specified name, contact information, and identifier.
     *
     * @param name    the name of the faculty member
     * @param contact the contact information of the faculty member
     * @param id      the identifier of the faculty member
     */
    Faculty(String name,String contact,String id){
        super(name,contact);
        this.id = id;
    }

    /**
     * Returns the role of the user as a String.
     *
     * @return a String representing the role of the user, which is "Faculty"
     */
   public String getRole(){
       return Constant.FACULTY ;
   }
}

