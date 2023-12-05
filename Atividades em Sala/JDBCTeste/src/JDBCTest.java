import model.ModelException;
import model.User;
import model.dao.MySQLUserDAO;
import model.dao.UserDAO;

public class JDBCTest {
		
	public static void main(String[] args) throws ModelException {
		User gabriel = new User();
		gabriel.setName("Gabriel Teste DAO");
		gabriel.setGender("M");
		gabriel.setEmail("gabriel@gmail.com");
		
		UserDAO userDAO = new MySQLUserDAO();
		userDAO.save(gabriel);
	}
}