package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    /*Test case to check calculateFare() returns expected totalFare*/
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance_InKM = 2;
        int time_InMin = 5;
        double totalFare = invoiceGenerator.calculateFare(distance_InKM,time_InMin);
        Assert.assertEquals(25,totalFare,0.0);
    }
}
