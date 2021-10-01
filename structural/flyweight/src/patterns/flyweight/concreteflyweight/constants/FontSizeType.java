package patterns.flyweight.concreteflyweight.constants;

public enum FontSizeType {
    TEN(10),FOURTEEN(14),TWENTY(20);

    private int value;

    FontSizeType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
