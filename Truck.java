public class Truck implements Vehicle{
    private String type;
    private double weeks;
    private final double rentRate = 500;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeeks() {
        return weeks;
    }

    public void setWeeks(double weeks) {
        this.weeks = weeks;
    }

    public Truck(String type, double week) {
        this.type = type;
        this.weeks = week;
    }

    @Override
    public double calculateRentCost() {
        return weeks *rentRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck type: "+type);
        System.out.println("Weekly rental rate: "+rentRate);
        System.out.println("Rented weeks: "+ weeks);
        System.out.println("Rental cost: "+calculateRentCost());
    }
}
