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
