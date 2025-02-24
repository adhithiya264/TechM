import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DisplayHTMLServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Simple HTML Page</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to My Web Page!</h1>");
        out.println("<p>This is a simple Java servlet serving HTML content.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
