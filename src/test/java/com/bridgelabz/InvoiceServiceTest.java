package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {

    /*Test case to check calculateFare() given Distance And Time Should Return TotalFare*/
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance_InKM = 2.0;
        int time_InMin = 5;
        double totalFare = invoiceGenerator.calculateFare(distance_InKM,time_InMin);
        Assert.assertEquals(25,totalFare,0.0);
    }

    /*Test case to check calculateFare() given Multiple Rides Should Return TotalFare*/
    @Test
    void givenMultipleRides_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0,5),
                new Ride(0.1,1)};
        double fare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30,fare,0.0);
    }
}
