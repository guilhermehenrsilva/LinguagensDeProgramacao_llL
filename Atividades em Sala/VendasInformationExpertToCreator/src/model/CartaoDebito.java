package model;

public class CartaoDebito implements Payment {
	@Override
	public double calculate (double price) {
		return price;
	}
}
