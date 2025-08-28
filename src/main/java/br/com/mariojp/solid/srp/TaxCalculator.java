package br.com.mariojp.solid.srp;

public class TaxCalculator {
    public double getTaxRate() {
        String rate = System.getProperty("tax.rate", "0.10");
        return Double.parseDouble(rate);
    }

    public double calculateTax(double subtotal) {
        return subtotal * getTaxRate();
    }
}