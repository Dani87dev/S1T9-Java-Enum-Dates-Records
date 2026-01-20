package n2exercise4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm a");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

        System.out.println(today.format(format1));
        System.out.println(today.format(format2));
        System.out.println(today.format(format3));
    }
}
