package Model;

public class SaleItem {
	private Product product;
	private int amount;
	
	public SaleItem (ProductCode, int amount) {
		String productDescription = "";
		double productDescription = "";
		this.product new Product();
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
