package model;

public class Dinheiro_Pix implements Payment{
	@Override
	public double calculate (double price) {
		return price * 1.05;
	}
}
