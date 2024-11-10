package org.PolymorphismEx;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  =new Scanner(System.in);

        List <Vehicle> rentedVechicles = new ArrayList<>() ;

        boolean systemRunning = true;

            while (systemRunning) {

                try {


                    System.out.println("** Welcome to Vehicle Rental System **");

                    System.out.println("1. Rent a car");
                    System.out.println("2. Rent a Bike");
                    System.out.println("3. Rent a Truck");
                    System.out.println("4. View Rented Vehicles");
                    System.out.println("5. Exit");

                    System.out.print("Choose an option from the above menu: \n");
                    int choose = scanner.nextInt();

                    switch (choose) {

                        case 1:
                            System.out.print("Enter Car Model: ");
                            scanner.nextLine();

                            String carModel = scanner.nextLine();

                            System.out.print("Enter Rental Days: ");

                            int carDays = scanner.nextInt();

                            System.out.println();

                            //System.out.println("Rental Details: ");
                            System.out.println("Rental Details: ");

                            Vehicle car = new Car(carModel, carDays);
                            rentedVechicles.add(car);

                            car.displayDetails();

                            System.out.println("-------------------------");
                            break;

                        case 2:

                            System.out.print("Enter Bike Brand: ");
                            scanner.nextLine();
                            String bikeBrand = scanner.nextLine();


                            System.out.print("Enter Rental Hours: ");
                            int bikeHour = scanner.nextInt();


                            System.out.println();

                            System.out.println("Rental Details: ");

                            Vehicle bike = new Bike(bikeHour, bikeBrand);
                            rentedVechicles.add(bike);
                            bike.displayDetails();
                            System.out.println("-------------------------");
                            break;

                        case 3:

                            System.out.print("Enter Truck Type: ");
                            scanner.nextLine();
                            String truckType = scanner.nextLine();


                            System.out.print("Enter Rental Weeks: ");
                            int truckWeek = scanner.nextInt();


                            System.out.println();


                            System.out.println("Rental Details: ");
                            Vehicle truck = new Truck(truckType, truckWeek);
                            rentedVechicles.add(truck);
                            truck.displayDetails();
                            System.out.println("-------------------------");
                            break;

                        case 4:

                            System.out.println("Rented Vehicles: \n");

                            if (rentedVechicles.isEmpty()) {
                                System.out.println("You don't hava any rented vehicle yet \n you can rent now from our system!");

                            } else {

                                for (Vehicle rentedArray : rentedVechicles) {
                                    rentedArray.displayDetails();

                                    System.out.println();
                                }
                            }
                            System.out.println("-------------------------");


                            break;

                        case 5:

                            System.out.println("Thank you for using the Vehicle Rental System! ");
                            systemRunning = false;
                            break;

                        default:
                            System.out.println("Enter a number in this range(1-5) only! \n");

                    } //End switch


                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input. Enter a number only!");
                    scanner.nextLine();

                }


            }//End while-loop


    } //End main method



} //End class
