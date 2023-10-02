package Model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Sale {
	private Date date;
	private List<SaleItem> itens;
	
	public Sale() {
		this.date = Calendar.getInstance().getTime();
		this.itens = new ArrayList<>();
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public List<SaleItem> getSaleItens(){
		return this.itens;
	}
	public void addSalesItens(SaleItem item) {
		this.itens.add(item);
	}
	public double getTotal() {
		double total = 0;
		for (SaleItem saleItem : itens) {
			total += saleItem.getSalesItemSubTotal();
		}
		return total;
	}
}
