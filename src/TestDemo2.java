import java.time.LocalDate;

public class TestDemo2{
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());
    }
}
