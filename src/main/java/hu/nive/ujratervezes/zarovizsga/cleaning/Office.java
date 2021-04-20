package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {
    public static final int BASIC_PRICE_OF_CLEANING = 100;
    private String address;
    private int area;
    private int numberOfFloor;


    public Office(String address, int area, int numberOfFloor) {
        this.address = address;
        this.area = area;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public int clean() {
        return this.area * this.numberOfFloor * BASIC_PRICE_OF_CLEANING;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
}
