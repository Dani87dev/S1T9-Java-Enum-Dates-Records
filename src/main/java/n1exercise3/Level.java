package n1exercise3;

public enum Level {
    LOW("White"),
    MEDIUM("Green"),
    HIGH("Black");

    private String colorName;

    Level(String colorName) {
        this.colorName = colorName;
    }

    public String getColor() {
        return this.colorName;
    }

    @Override
    public String toString() {
        return "Level " + name();
    }
}
