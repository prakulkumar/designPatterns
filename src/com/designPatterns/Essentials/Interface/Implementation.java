package com.designPatterns.Essentials.Interface;

public class Implementation {
    public static void perform() {
        var taxCalculator = getTaxCalculator();
        var tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }

    public static TaxCalculator getTaxCalculator() {
        return new TaxCalculator2021();
    }
}
