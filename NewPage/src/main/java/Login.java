import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;

@WebServlet("/login")
public class Login extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("Text/html; charset=UTF-8");

    String id = req.getParameter("id");
    String password = req.getParameter("password");
    Member m = new Member();

    Iterator<People> itr = m.members.listIterator();

    for(People member : m.members){
      itr.next();
      if(member.id.equals(id) && member.password.equals(password)){
        resp.getWriter().append("Welcome" + member.name);
      } else if(itr.hasNext()) {
        System.out.println("has next");
      } else {
        System.out.println("no next");
        resp.getWriter().append("Please check your id or password");
      }
    }
  }
}
