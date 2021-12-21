

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.jaspdemo1.been;

/**
 * Servlet implementation class demoservlet
 */
@WebServlet("/demoservlet")
public class demoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<been> s = new ArrayList();
		s.add(new been(1,"ganesh",100));
		s.add(new been(2,"abhi",200));
		s.add(new been(3,"ram",300));
		request.setAttribute("a",s);
		RequestDispatcher r = request.getRequestDispatcher("servletco.jsp");
		r.forward(request, response);
	}

}
