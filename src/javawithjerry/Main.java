package javawithjerry;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // THE MATH CLASS
        int roundMe = Math.round(3.55F);
        System.out.println(roundMe);
        double ceilMe = Math.ceil(3.01F);
        System.out.println(ceilMe);
        double floorMe = Math.floor(4.99F);
        System.out.println(floorMe);
        float maxMe = Math.max(3.999F, 4.0F);
        System.out.println(maxMe);
        float minMe = Math.min(4.001F, 4.0F);
        System.out.println(minMe);
        double randMe = Math.random() * 100;
        System.out.println(Math.round(randMe));

        // FORMATTING NUMBERS
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat taxes = NumberFormat.getPercentInstance();
        String currResult = currency.format(1234567.891);
        String taxResult = taxes.format(.25);
        String income = "This year made " + currResult + " dollars and paid "  + taxResult + " in taxes";
        System.out.println(income);
    }
}