/*
This Class is an extended class of abstract Pass Class which is used to
calculate expiry date of subscription and type of pass.
Contributors -> Rudra Pratap Singh, Jayant Singh
 */
import java.time.LocalDate;
class Monthly extends Pass {

    /**
     * Calculates and returns the expiry date of the Monthly pass, which is set to one month from the current date.
     *
     * @return a String representing the expiry date of the Monthly pass
     */
    public String getExpiryDate(){
        LocalDate currentDateTime = LocalDate.now();
        return currentDateTime.plusMonths(1).toString();
    }

    /**
     * Returns the type of pass as a String.
     *
     * @return a String representing the type of the pass, which is "Monthly"
     */
    public String type(){
        return "Monthly";
    }
}

