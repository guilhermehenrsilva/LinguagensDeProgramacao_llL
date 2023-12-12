package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelException;
import model.User;
import model.dao.DAOFactory;
import model.dao.UserDAO;

// Rotas 
@WebServlet(urlPatterns = {"", "/save", "/user/update", "/user/delete"})
public class UsersController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String uri = req.getRequestURI();

		switch(uri) {

		case "/facebook/" :{

			// Carregar Usuarios 
			loadUsers(req);

			//direcionar a chamada para a index.html
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			break;
		}

		case "/facebook/save":{

			insertUser(req);
			
			resp.sendRedirect("/facebook");

			break;
		}

		case "/facebook/user/update":{

			loadUser(req);

			RequestDispatcher rd = req.getRequestDispatcher("/form_user.jsp");
			rd.forward(req, resp);

			break;
		}
		
		case "/facebook/user/delete":{

			deleteUser(req);
			resp.sendRedirect("/facebook");
			
			break;
		}

		default:
			PrintWriter writer = resp.getWriter();
			writer.append("404 recurso nao encontrado:" + uri);
		}
	}

	private void deleteUser(HttpServletRequest req) {
		String userId = req.getParameter("userId");
		
		User user = new User(Integer.parseInt(userId));
		
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);
		
		try {
			dao.delete(user);
		} catch (ModelException e) {
			e.printStackTrace();
		}
		
	}

	private void loadUser(HttpServletRequest req) {
		String idUserStr = req.getParameter("userId");

		int userId = idUserStr != null ? Integer.parseInt(idUserStr): 0;

		UserDAO dao = DAOFactory.createDAO(UserDAO.class);

		User user = null;
		try {
			user = dao.findById(userId);
		} catch (ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		req.setAttribute("usuario", user);

	}

	private void insertUser(HttpServletRequest req) {
		String name = req.getParameter("user-name");
		String gender = req.getParameter("user-gender");
		String email = req.getParameter("email");
		
		User user = new User();
		user.setName(name);
		user.setGender(gender);
		user.setEmail(email);
		
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);
		
		try {
			dao.save(user);
		} catch (ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void loadUsers(HttpServletRequest req) {
		//criar DAO
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);

		List<User> users = null;

		try {
			users = dao.listAll();
		}catch(ModelException e) {
			e.printStackTrace();
		}
		req.setAttribute("usuarios", users);
	}
}