package n2exercise3;

import java.time.Duration;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate data1 = LocalDate.now();

        data1 = data1.plusDays(5)
                .plusMonths(4)
                .plusYears(3);


        System.out.println(data1);

    }
}
