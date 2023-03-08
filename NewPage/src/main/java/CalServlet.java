import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cal")
public class CalServlet extends HttpServlet {
  String name = "계산기";
  int num1;
  int num2;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("Text/html; charset=UTF-8");

    try {
      num1 = Integer.parseInt(req.getParameter("num1"));
      num2 = Integer.parseInt(req.getParameter("num2"));
      String how = req.getParameter("how");

      resp.getWriter().append("<body><h2>"+name+"을 출력합니다."+"</h2>" + "</body>");
      if(how.equals("add")) {
        resp.getWriter().append("<h2> num1 + num2 = "+(num1+num2) + "</h2>") ;
      } else if(how.equals("minus")) {
        resp.getWriter().append("<h2> num1 - num2 = "+(num1-num2) + "</h2>") ;
      }
    } catch (NumberFormatException e) {
      resp.getWriter().append("잘못된 입력값입니다.");
    }

    System.out.println(req.getMethod());
    System.out.println(req.getRequestURL());
    System.out.println(req.getRequestURI());
    System.out.println(req.getLocalAddr());
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("Text/html; charset=UTF-8");

    try {
      num1 = Integer.parseInt(req.getParameter("num1"));
      num2 = Integer.parseInt(req.getParameter("num2"));
      String how = req.getParameter("how");

      resp.getWriter().append("<body><h2>"+name+"을 출력합니다."+"</h2>" + "</body>");
      if(how.equals("add")) {
        resp.getWriter().append("<h2> num1 + num2 = "+(num1+num2) + "</h2>") ;
      } else if(how.equals("minus")) {
        resp.getWriter().append("<h2> num1 - num2 = "+(num1-num2) + "</h2>") ;
      }
    } catch (NumberFormatException e) {
      resp.getWriter().append("잘못된 입력값입니다.");
    }
    
    System.out.println(req.getMethod());
    System.out.println(req.getRequestURL());
    System.out.println(req.getRequestURI());
    System.out.println(req.getLocalAddr());
  }
}
