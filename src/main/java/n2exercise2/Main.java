package n2exercise2;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[]args){

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(1987, 9, 16);

        Period period = Period.between(date1, date2);

        System.out.println(period);


    }
}
