package n1exercise4;

public class OperatingSystemConverter {

    public static OperatingSystem convertToOs(String value) {
        try {
            return OperatingSystem.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Operating System unexpected");
        }
    }
}
