package model;

public class Cash implements Payment{

	private double discount;
	
	public Cash(double discout) {
		this.discount = discout/100;
	}
	
	@Override
	public String description() {
		return "Dinheiro/Pix";
	}

	@Override
	public Double value(Double saleValue) {
		double value = saleValue - (this.discount * saleValue);
		return value;
	}
	
}
