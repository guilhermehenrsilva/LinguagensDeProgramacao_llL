
public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		User guilherme = new User ();
		guilherme.setNome("Guilherme");
		guilherme.setCpf("132.447.506-48");
		System.out.println(guilherme);
		System.out.println("Lista de Amigos");
		
		for (String friendName : guilherme.getFriends()) {
			System.out.println(friendName);
		}
			
	}

}
