import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<head>" +
                "    <meta charset=\"UTF-8\">" +
                "    <title>Servlet</title>" +
                "</head>");
        out.println("<body><h1>Welcome to Servlets</h1></body>");
        out.println("</HTML>");
        out.close();
    }

}
