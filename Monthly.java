/*
This Class is an extended class of abstract Pass Class which is used to
calculate expiry date of subscription and type of pass.
Contributors -> Rudra Pratap Singh, Jayant Singh
 */
import java.time.LocalDate;
class Monthly extends Pass {
    public String getExpiryDate(){
        LocalDate currentDateTime = LocalDate.now();
        return currentDateTime.plusMonths(1).toString();
    }
    public String type(){
        return "Monthly";
    }
}

