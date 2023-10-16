package model;

public class CartaoCredito implements Payment {
	@Override	
	public double calculate (double price) {
		return price * 1.05;
	}
}
