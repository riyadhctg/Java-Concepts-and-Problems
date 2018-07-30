package riyadh.sharif;

public class Car {

    protected int doors;
    private int wheels;
    public static int windows = 4;

    public Car () {
        System.out.println("I am the Car constructor");
    }

    public Car (String color) {
        System.out.println("I am the " + color + " Car constructor");
    }

    public String fuelIntake (String fuel) {
        return "Takes " + fuel;
    }

}
