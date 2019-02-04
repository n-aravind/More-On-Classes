public class Vehicle {

    private String make;
    private String model;
    private int gears;
    private double mileage;

    public Vehicle(String make, String model, int gears, double mileage) {
        this.make = make;
        this.model = model;
        this.gears = gears;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getGears() {
        return gears;
    }

    public double getMileage() {
        return mileage;
    }
}
