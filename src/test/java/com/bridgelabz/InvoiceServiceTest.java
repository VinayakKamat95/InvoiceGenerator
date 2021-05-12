package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


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

    /*Test case to check calculateFare() given Multiple Rides Should Return Invoice Summary*/
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = { new Ride(2.0,5), new Ride(0.1,1) };
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }
}
