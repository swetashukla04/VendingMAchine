package item;

public enum ItemType {
    OREO("Oreo"),
    JUICE("Juice"),
    COKE("Coke"),
    SODE("Soda"),
    CHIPS("chips"),
    CHOCOLATE("Chocolate"),
    CANDY("Candy"),
    GUM("Gum");

    private final String value;

    private ItemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
