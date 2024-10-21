/*
This is an abstract class serving 2 others classes, used to store id, contact, and name
of the User
Contributors -> Ojas Joshi
 */
abstract class User {
    String contact;
    String name;

    /**
     * Constructs a User with the specified name and contact information.
     *
     * @param name    the name of the user
     * @param contact the contact information of the user
     */
    User(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    /**
     * Displays the user's information, including their name and contact details.
     */
    void getInfo() {
        System.out.println(Constant.NAME + name);
        System.out.println(Constant.USER_CONTACT + contact);
    }

    /**
     * An abstract method that must be implemented by subclasses to return the role of the user.
     * @return a String representing the role of the user
     */
    public abstract String getRole();
}