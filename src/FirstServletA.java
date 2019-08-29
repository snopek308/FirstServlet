import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServletA", urlPatterns = "/hello")
public class FirstServletA extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String p =request.getParameter("param1");
        String pB = request.getParameter("param2");

        String msg = "<html><body>" + p + "</body></html>";
        response.getWriter().print(msg);
        String msgB = "<html><body>" + pB + "</body></html>";
    }
}
