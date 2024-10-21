/*
This Class is an extended class of abstract Pass Class which is used to
calculate expiry date of subscription and type of pass.
Contributors -> Rudra Pratap Singh, Jayant Singh
 */
import java.time.LocalDate;

class Annually extends Pass{

    /**
     * Calculates and returns the expiry date of the Annually pass, which is set to one year from the current date.
     *
     * @return a String representing the expiry date of the Annually pass in ISO-8601 format (YYYY-MM-DD)
     */
    public String getExpiryDate(){
        LocalDate currentDateTime = LocalDate.now();
        return currentDateTime.plusYears(1).toString();
    }

    /**
     * Returns the type of pass as a String.
     *
     * @return a String representing the type of the pass, which is "Annually"
     */
    public String type(){
        return "Annually";
    }

}