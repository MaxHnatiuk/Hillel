package OOP;

public enum Size{
    S("S", 26, 30),
    M("M", 32, 36),
    L("L", 40, 44),
    XL("XL", 44, 48);
    private final String abbreviation;
    private final int width;
    private final int length;
    public String getAbbreviation() {
        return abbreviation;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    private Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }
}