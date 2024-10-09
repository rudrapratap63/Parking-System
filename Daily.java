import java.time.LocalDate;

public class Daily extends Pass{
    public String getExpiryDate(){
        LocalDate currentDateTime = LocalDate.now();
        return currentDateTime.plusDays(1).toString();
    }
    public String type(){
        return "Daily";
    }

}