package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {

        String product = "Dinosaur toy/s";
        double productPrice = 3.99;
        int productAmount = 2;

        System.out.println("You bought " + productAmount + " " + product + " for $" + (productAmount * productPrice) + "!");
    }
}
