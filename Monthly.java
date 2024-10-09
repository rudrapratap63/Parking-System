
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

