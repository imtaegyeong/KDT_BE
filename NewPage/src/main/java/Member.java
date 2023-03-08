import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/member")
public class Member extends HttpServlet {
  static List<People> members = new ArrayList<>();
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("Text/html; charset=UTF-8");

    String id = req.getParameter("id");
    String password = req.getParameter("password");
    String name = req.getParameter("name");


    People p = new People();
    p.id = id;
    p.password = password;
    p.name = name;
    members.add(p);
    System.out.println(members.get(0).name);
    resp.getWriter().append("Welcome" + name);
  }
}
