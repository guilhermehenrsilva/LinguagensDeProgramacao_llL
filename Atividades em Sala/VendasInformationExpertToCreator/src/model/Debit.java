package model;

public class Debit implements Payment {

	private double discount;
	
	public Debit (double discount) {
		this.discount = discount/100;
	}
	
	@Override
	public String description() {
		return "Cartão de Débito";
	}

	@Override
	public Double value(Double saleValue) {
		double value = saleValue - (this.discount * saleValue);
		return value;
	}
}
