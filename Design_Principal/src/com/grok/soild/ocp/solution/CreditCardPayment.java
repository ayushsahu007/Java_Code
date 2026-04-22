package com.grok.soild.ocp.solution;

public class CreditCardPayment implements Payment{
    public void process(){
        //Process credit card process
    }
}

class PayPalPayment implements Payment {
    public void process() { /* Process PayPal */ }
}

class UpiPayment implements Payment{
    public void process(){
        //this clsss open for extension
        //but close for modification
        //You should be able to add new functionality without changing existing code.
    }
}

class PaymentProcessor {
    void processPayment(Payment payment) {
        payment.process();
    }
}