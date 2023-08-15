public abstract class User {
	private int id;
	private String nome;
	private String birthDate;
	
	
	protected  User (int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String  formatPersonalData() {
		
		return String.format("ID: %d\nNome: %s", this.id , this.nome);
		//return "ID: " + this.id + "Nome: " + this.nome;
	}

	
}
