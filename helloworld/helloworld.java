package helloworld;

import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test01")
public class helloworld extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().write("Hello World!!!\n");
		
	    String vals[] = request.getParameterValues("name");
	    if (vals != null){
	      for (int i = 0 ; i < vals.length ; i++){
	    	  String decoded = URLDecoder.decode(new String(vals[i].getBytes("ISO-8859-1")), StandardCharsets.UTF_8.name());
	    	  response.getWriter().write(decoded);
	      	}
	      response.getWriter().write("\n");
	    }
		String decoded2 = URLDecoder.decode("%e3%81%bb%e3%81%92%e3%81%bb%e3%81%92", StandardCharsets.UTF_8.name());
		response.getWriter().write(decoded2);
	}
}
