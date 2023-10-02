package View;

import Model.Product;
import Model.Sale;
import Model.SaleItem;

public class Main {

	public static void main(String[] args) {
		Product arroz = new Product ("Arroz Pileco, T1", 15);
		Product feijao = new Product ("Feijão Malicia", 20);
		
		SaleItem siArroz = new SaleItem(arroz,3);
		SaleItem sisFeijão = new SaleItem(feijao,2);
		
		Sale sale = new Sale();
		sale.addSalesItens(siArroz);
		sale.addSalesItens(sisFeijão);
		
		System.out.println(String.format("Venda - #1234 - %s",
				sale.getDate().toLocaleString()));
		
		for(SaleItem saleItem : sale.getSaleItens()) {
			System.out.print(saleItem.getProduct().getDescription() + " - ");
			System.out.print(saleItem.getAmount() + " - ");
			System.out.print("R$" + saleItem.getProduct().getPrice() + " - ");
			System.out.print("R$" + saleItem.getSalesItemSubTotal() + "\n");
		}
		
		System.out.println("Total: R$" + sale.getTotal());
	}

}
