package org.PolymorphismEx;

public class Bike implements Vehicle{

    private String brand;
    private int hour;
    private static double hourlyRate = 10;


    public Bike(int hour, String brand) {
        this.hour = hour;
        this.brand = brand;
    }

    @Override
    public double calculateRentalCost() {
        double bikeCost = ( hour * hourlyRate);
        return bikeCost;
    }

    @Override
    public void displayDetails() {

        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: " + "$" + hourlyRate);
        System.out.println("Rental Cost: " + "$" + calculateRentalCost());

    }






}//End of class
