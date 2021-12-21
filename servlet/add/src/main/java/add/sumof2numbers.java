package add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;


public class sumof2numbers extends HttpServlet
{
	public void doPost(HttpServletRequest req , HttpServletResponse res ) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		PrintWriter out = res.getWriter();
		out.println("the sum of numbers is "+ k);
	}

}
