
	public class Impostos {
		
		private String nome;
		private double porcentagem;
		
		public Impostos(String nome, double porcentagem) {
			this.nome = nome;
			this.porcentagem = porcentagem;
		}

		public double getPorcentagem() {
			return porcentagem;
		}

		public void setPorcentagem(double porcentagem) {
			this.porcentagem = porcentagem;
		}

		public String getNome() {
			return nome;
		}
		
		
	}

