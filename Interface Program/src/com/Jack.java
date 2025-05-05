package com;

class Jack implements Uber{
    //override bookCab()
    @Override
    public void bookCab() {
        System.out.println("Booking Cab");
    }
     //override payAmount()
    @Override
    public void payAmount() {
        System.out.println("Paying Amount");
    }
    public static void main(String[] args) {
        //Jack instance & call both methods
        Jack j = new Jack();
        j.bookCab();
        j.payAmount();
    }


}
