package com.grok.soild.ocp.bad;

public class PaymentProcessor {
    void processPayment(String paymentType){
        if(paymentType.equals("CreditCard")){
            //Process credit card payment
        } else if (paymentType.equals("Paypal")) {
            //process Paypal Payment
        }
    }
}
