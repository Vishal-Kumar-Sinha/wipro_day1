import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class Simplestservlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get form data
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String message = req.getParameter("message");
        // Set response content type
        resp.setContentType("text/html");
        // Generate response page
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Form Submission</title></head><body>");
        out.println("<p>Thank You, " + name + "!</p>");
        out.println("<p>Your email: " + email + "</p>");
        out.println("<p>Your message: " + message + "</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}