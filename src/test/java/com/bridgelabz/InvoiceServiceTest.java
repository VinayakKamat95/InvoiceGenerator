package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    @Test
    public void displayMessageTest(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        invoiceGenerator.displayMessage();
    }
}
