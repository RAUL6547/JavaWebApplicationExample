package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html lang=es>");
		out.println("<head><title>HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:blue;'>Servlet</h1>");
		out.println("<h3><b>HTML desde Servlet</b></h3>");
		out.println("<form action='/myServlet2'>");
		out.println("<label for='nombre'" + request.getParameter("nombre") + ">Nombre:</label><br>");
		out.println("<input type='text' id='nombre' name='nombre' value='' placeholder='Nombre'><br><br>");
		out.println("<label for='apellido'>Apellido:</label><br>");
		out.println("<input type='text' id='apellido' name='apellido' value='' placeholder='Apellido'><br><br>");
		out.println("<button type='submit'>Enviar</button>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
