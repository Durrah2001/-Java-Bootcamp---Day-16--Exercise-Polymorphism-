package org.PolymorphismEx;

public class Car implements Vehicle{

    private String model;
    private int days;
    private static double dailyRate = 50;

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

    @Override
    public double calculateRentalCost() {
        double carCost = ( days * dailyRate );
        return carCost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model );
        System.out.println("Daily Rental Rate: " + "$" + dailyRate);
        System.out.println("Rental Cost: " + "$" + calculateRentalCost());

    }

}//End of class









