package Servelet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html; charset=UTF-8");
    // query parameters 로 넘어온 매개변수를 변수에 저장한 후
    // 2단 이면 2단을 출력 , 3단 이면 3단을 출력
    int dan = 0;
    int limit = 6;
    try {
      dan = Integer.parseInt(req.getParameter("dan")); // 여기에서 numberformatexception 발생
      req.setAttribute("dan", dan);
      req.setAttribute("limit", limit);
      //jsp 담당 디스패처 불러오기
      RequestDispatcher requestDispatcher = req.getRequestDispatcher("gugudan.jsp");
      //리퀘스트 값들 넘기기(forward)
      requestDispatcher.forward(req, resp);
    } catch (NumberFormatException e) {
      resp.getWriter().append("입력값이 없습니다.");
    }
  }
}
