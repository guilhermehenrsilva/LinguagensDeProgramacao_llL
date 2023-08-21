import java.util.List;

	public class produtos {
		private String nome;
		private double precoCusto; 
		private double margemLucro;
		private List<Impostos> impostos;
		
	
	public void Produto (String nome, double PrecoCusto,List<Impostos> impostos,double margemLucro) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.impostos = impostos;
		this.margemLucro = margemLucro;
   }

	public void calcularPrecoFinal() {
		
	}
		
}
