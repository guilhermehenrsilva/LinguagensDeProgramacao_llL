
public class Impostos {
	private String nome;
	private double taxa;
	
	public void Imposto(String nome, double taxa) {
		this.nome = nome;
		this.taxa = taxa;
	}
	
	
	public double calcularImposto(double valorBase) {
		return  valorBase * taxa / 100;
	}
	
	public String getNome() {
		return nome;
	}
}

