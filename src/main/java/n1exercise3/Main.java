package n1exercise3;

public class Main {

    public static void main(String[] args) {

        for (Level element : Level.values()) {
            System.out.println(element + " color: " + element.getColor());
        }
    }

}
