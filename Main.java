import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicle = new ArrayList<>();

        Car car = new Car("m",10);
        Bike bike =new Bike("b",12);
        Truck truck = new Truck("m",2);

        int choice=0;
        do {
            System.out.println("Vehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicle");
            System.out.println("5. Exit");
            try {
                choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter car model: ");
                    String model;
                    model=scanner.next();

                    System.out.println("Enter rental days: ");
                    int days;
                    days= scanner.nextInt();

                    rentedVehicle.add(new Car(model,days));

                    break;

                case 2:
                    System.out.println("Enter bike brand: ");
                    String brand;
                    brand=scanner.next();

                    System.out.println("Enter rental hours: ");
                    int hours;
                    hours= scanner.nextInt();

                    rentedVehicle.add(new Bike(brand,hours));

                    break;

                case 3:
                    System.out.println("Enter truck type: ");
                    String type;
                    type=scanner.next();

                    System.out.println("Enter rental weeks: ");
                    int weeks;
                    weeks= scanner.nextInt();

                    rentedVehicle.add(new Truck(type,weeks));

                    break;

                case 4:
                    for (Vehicle v: rentedVehicle){
                        v.displayDetails();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Thanks for using our system");
            }
            }catch (InputMismatchException e){
                System.out.println("Wrong input type");
            }
        }while (choice != 5);
    }
}