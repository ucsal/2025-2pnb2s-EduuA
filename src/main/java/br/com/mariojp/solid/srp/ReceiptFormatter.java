package br.com.mariojp.solid.srp;

public class ReceiptFormatter {
    public String format(double subtotal, double tax, double total) {
        return String.format("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f", subtotal, tax, total);
    }
}