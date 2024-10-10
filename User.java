abstract class User {
    int id ;
    String contact;
    String name;
    User(String name,String contact){
        this.id = Constant.id ;
        this.name = name;
        this.contact = contact;
    }
    User(){
        this.id = Constant.id;
        this.name = null;
    }
    void getInfo() {
        System.out.println(Constant.USER_ID + Constant.id++ + Constant.NAME + name);
        System.out.println(Constant.USER_CONTACT + contact);
    }
    public abstract String getRole();
}