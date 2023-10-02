package Model;

public class SaleItem {
	private Product product;
	private int amount;
	
	public SaleItem (Product p, int amount) {
		this.product = p;
		this.amount = amount;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getAmount() {
		return this.amount;
	}
	public double getSalesItemSubTotal() {
		return this.amount * this.product.getPrice();
	}
}
