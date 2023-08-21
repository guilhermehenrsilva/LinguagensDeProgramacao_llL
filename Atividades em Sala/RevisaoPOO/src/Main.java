
public class Main {

	public static void main(String[] args) {
		 Student maria = new Student(1, 999);
		 maria.setNome("Maria");
		 maria.setBirthDate("11/06/2000");
		 maria.setCourse("SI");
		 maria.setSemester((short)4);
	 
		 Professor guilherme = new Professor (2, "217");
		 guilherme.setNome("Guilherme");
		 guilherme.setLevel("Doutor");
		 guilherme.setArea("Informatica");
		 
		 At ju = new At(3, "891");
		 ju.setNome("Julia");
		 ju.setArea("TI");
		 ju.setRole("Tecnica em laboratório");
		 
		 
		 printUserData(maria);
		 printUserData(guilherme);
		 printUserData(ju);
		/* System.out.println(maria.toString()+ "\n " + maria.formatPersonalData());
		 System.out.println(guilherme.toString()+ "\n " + guilherme.formatPersonalData());
		 System.out.println(ju.toString()+ "\n " + ju.formatPersonalData());*/
	}
		
		 private static void printUserData(User user) {
			System.out.println(user.formatPersonalData());
		 }	
	}


