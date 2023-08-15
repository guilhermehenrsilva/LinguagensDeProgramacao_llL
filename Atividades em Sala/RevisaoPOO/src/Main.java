
public class Main {

	public static void main(String[] args) {
		 Student maria = new Student(1, 999);
		 maria.setNome("Maria");
		 maria.setBirthDate("11/06/2000");
		 maria.setCourse("SI");
		 maria.setSemester((short)4);
		 
		 Student jose = new Student(2, 101);
		 jose.setNome("José");
		 jose.setBirthDate("11/06/2001");
		 jose.setCourse("ADM");
		 jose.setSemester((short)8);
		 
		 System.out.println(maria.toString()+ "\n " + maria.formatPersonalData());
		 System.out.println(jose.toString()+ "\n " + jose.formatPersonalData());
		}
	
	}

