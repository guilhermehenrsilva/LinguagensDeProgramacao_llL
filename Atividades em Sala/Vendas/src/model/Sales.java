package model;

import java.util.ArrayList;
import java.util.List;

public class Sales { 
		
	public double quantity;
	public double totalValue;
	public List<Products> products;
	
	public Sales (double quantity, double totalValue) {
		this.quantity = quantity;
		this.totalValue = totalValue;
		this.products = new ArrayList<>();
	}
	
	
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue( double totalValue) {
		this.totalValue = totalValue;
	}
	
	
	public double CalculeteSale () {
		double unitPrice = 
	}
}
