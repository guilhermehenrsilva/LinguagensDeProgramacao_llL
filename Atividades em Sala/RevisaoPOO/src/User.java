import java.util.ArrayList;
import java.util.List;

public class User {
	private String nome;//escopo global
	private String cpf;
	private List<String> friends;
	
	public User() {
		friends = new ArrayList<>();
		friends.add("Luiza");
		friends.add("Rosana");
		friends.add("Noé");
	}
	
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public List<String> getFriends(){
		return this.friends;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) { // escopo local
		/*if (cpf == null || cpf.equals("")) {
			return;
		}else {
			cpf = cpf;
		}*/
		this.cpf = cpf;
	}
}
