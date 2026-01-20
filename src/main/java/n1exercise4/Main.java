package n1exercise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Please, enter your operating system: ");
            String input = scanner.nextLine();

            OperatingSystem osPlayer = OperatingSystemConverter.convertToOs(input);

            System.out.println(osPlayer);

            scanner.close();

        }
}
