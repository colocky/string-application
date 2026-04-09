package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        //1. Declare a variable to store your favorite color
        String favColor = "Green";
        System.out.println("My favorite color is " + favColor + "!");

        //2. Declare a variable to store the year you started this class
        int yearStartedClass = 2026;
        System.out.println("I started YearUp in " + yearStartedClass + "!");

        //3. Declare a variable to store your middle initial
        char middleInitial = 'A';
        System.out.println("My middle initial is  " + middleInitial + "!");

        //4. Declare a variable to store whether you have pets (yes/no)
        boolean hasPet = false;
        if (!hasPet) {
            System.out.println("I do not have a pet");}
        else {
            System.out.println("I have a pet!");}

        //5. Declare a variable with a nice message or saying
        String niceMessage = "You are a valuable person";
        System.out.println(niceMessage);

        // Declare AND initialize variables for:
        //1. The number of days in a week
        int daysInWeek = 7;
        //2. The price of coffee ($4.99)
        float priceOfcoffee = 4.99f;
        //3. Your favorite letter
        char favLetter = 'A';
        //4. Whether it's raining (true/false)
        boolean isRaining = false;
        //5. Print all values in complete sentences

        System.out.println("There are " + daysInWeek + "days in a week");
        System.out.println("A coffee is $" + priceOfcoffee + "!");
        System.out.println("My favorite letter is " + favLetter + "!");
        if (!isRaining) {
            System.out.println("It is not raining.");}
        else {
            System.out.println("It's raining!");
        }

    }
}
