

import java.util.Arrays;
import java.util.List;

import br.com.mariojp.solid.srp.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("tax.rate", "0.08"); // Exemplo: taxa de 8%

        List<Item> items = Arrays.asList(
            new Item("Arroz", 5.0, 2),
            new Item("Feijão", 7.5, 1),
            new Item("Macarrão", 3.0, 3)
        );

        TaxCalculator taxCalculator = new TaxCalculator();
        ReceiptFormatter formatter = new ReceiptFormatter();
        ReceiptService service = new ReceiptService(taxCalculator, formatter);

        String receipt = service.generateReceipt(items);
        System.out.println(receipt);
    }
}