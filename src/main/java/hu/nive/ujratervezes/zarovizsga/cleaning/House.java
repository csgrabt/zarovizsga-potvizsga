package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable {

    public static final int BASIC_PRICE_OF_CLEANING = 80;
    private final String address;
    private final int area;

    public House(String address, int area) {
        this.address = address;
        this.area = area;
    }

    @Override
    public int clean() {
        return this.area * BASIC_PRICE_OF_CLEANING;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
}
