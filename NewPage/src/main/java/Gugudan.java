import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gugudan")
public class Gugudan extends HttpServlet {
  String gugudan = "구구단";
  String gugudan2 = " 2 X  2  = 4";
  int dan = 0;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("Text/html; charset=UTF-8");

    try {
      dan = Integer.parseInt(req.getParameter("dan"));

      resp.getWriter().append("<body><h2>"+dan+"단을 출력합니다."+"</h2>" + "</body>");
      for (int i = 1; i < 10; i++)
        resp.getWriter().append("<h2>"+dan + "X" + i + "=" + (dan * i)+"<h2>");
    } catch (NumberFormatException e) {
      resp.getWriter().append("입력값이 없습ㄴ디ㅏ");
    }

    System.out.println(req.getMethod());
    System.out.println(req.getRequestURL());
    System.out.println(req.getRequestURI());
    System.out.println(req.getLocalAddr());
    System.out.println(req.getParameter("dan"));
  }
}
