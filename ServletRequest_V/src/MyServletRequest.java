import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletRequest extends HttpServlet
{

	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("name");
		
		String pass=request.getParameter("pwd");
		
		out.println("the user name:"+name);
		out.println("the password ::"+pass);
		
	}
}
