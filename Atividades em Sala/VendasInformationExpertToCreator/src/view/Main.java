package view;

import model.Credit;
import model.Payment;
import model.Sale;

public class Main {

	public static void main(String[] args) {
		Sale sale = new Sale();
		sale.addItem("arroz", 3);
		sale.addItem("feijao", 2);
		sale.addItem("sal", 1);
		// CC - Credito
		// Cd - Débito
		// C - Dinheiro/pix
		sale.addPayment("cd");
		
		System.out.println(String.format("Venda - #1234 - %s", 
				sale.getDate().toLocaleString()));
		
		for (String si : sale.getSaleItems()) {
			System.out.println(si);
		}
		
		System.out.println(String.format("Total: R$:%.2f", sale.getTotal()));
		
		System.out.println("Forma de pagamento: " + sale.getPayment());
		System.out.println("Valor a ser pago: "+ sale.paymentValue());
		
		
		
		
	}
}
