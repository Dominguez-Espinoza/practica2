package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ejercicio2
 */
public class Ejercicio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Ejercicio2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Enumeration<String> headerNames = request.getHeaderNames();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<br>");
		out.println("<h3> Encabezados del Protocolo HTTP enviados desde el cliente al servidor </h3>");
		out.println("<br>");
		out.println("<h4> Metodo utilizado: " + request.getMethod() + "</h4>");
		out.println("<h4>URI: " + request.getRequestURI() + "</h4>");
		out.println("<h4>Protocolo: " + request.getProtocol() + "</h4>");
		out.println("<br>");
		out.println("<h4>Listado de encabezados del Protocolo HTTP: </h4>");
		
		
		while(headerNames.hasMoreElements())
		{
			String headerName = (String) headerNames.nextElement();
			out.println("<h4>" + headerName + " :   </h4>");
			out.println(request.getHeader(headerName));
		}
		out.println("</body>");
		out.println("</html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
