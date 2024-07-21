public class Bike implements Vehicle{
    private String brand;
    private double hours;
    private final double rentRate = 10;

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Bike(String brand, double hours) {
        this.brand = brand;
        this.hours = hours;
    }

    @Override
    public double calculateRentCost() {
        return hours*rentRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike model: "+brand);
        System.out.println("Daily rental rate: "+rentRate);
        System.out.println("Rented hours: "+hours);
        System.out.println("Rental cost: "+calculateRentCost());
    }
}
