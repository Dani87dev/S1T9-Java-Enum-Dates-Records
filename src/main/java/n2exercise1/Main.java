package n2exercise1;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDate localDateObj = LocalDate.now();
        LocalTime localTimeObj = LocalTime.now();
        LocalDateTime localDateTimeObj = LocalDateTime.now();

        System.out.println("Showing date with localDate " + localDateObj);
        System.out.println("Showing time with localTime " + localTimeObj);
        System.out.println("Showing date and time with localDateTime " + localDateTimeObj);


    }
}
