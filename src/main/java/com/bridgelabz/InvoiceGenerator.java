package com.bridgelabz;

public class InvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final double MINIMUM_FARE = 5;

    /*calculateFare() method takes distance and time to calculate and return totalFare if grater then MINIMUM_FARE*/
    public double calculateFare(double distance_inKM, int time_inMin) {
        double totalFare = distance_inKM * MINIMUM_COST_PER_KM + time_inMin * COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_FARE);
    }

    /*calculateFare() method takes Ride[] Array return totalFare*/
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for(Ride ride : rides){
            totalFare += this.calculateFare(ride.distance,ride.time);
        }
        return totalFare;
    }
}
