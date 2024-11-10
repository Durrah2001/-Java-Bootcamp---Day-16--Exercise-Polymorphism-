package org.PolymorphismEx;

public class Truck implements Vehicle{

    private String type;
    private int week;
    private static double weeklyRate = 500;


    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        double truckCost = ( week * weeklyRate );
        return truckCost;
    }

    @Override
    public void displayDetails() {

        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: " + "$" + weeklyRate);
        System.out.println("Rental Cost: " + "$" + calculateRentalCost());

    }


} //End of class
