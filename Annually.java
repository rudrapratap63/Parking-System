import java.time.LocalDate;

class Annually extends Pass{
    public String getExpiryDate(){
        LocalDate currentDateTime = LocalDate.now();
        return currentDateTime.plusYears(1).toString();
    }
    public String type(){
        return "Annually";
    }

}