public class Car implements Vehicle{
    private String model;
    private int days;
    private final double rentRate=50;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentCost() {
        return days*rentRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car model: "+model);
        System.out.println("Daily rental rate: "+rentRate);
        System.out.println("Rented days: "+days);
        System.out.println("Rental cost: "+calculateRentCost());
    }
}
