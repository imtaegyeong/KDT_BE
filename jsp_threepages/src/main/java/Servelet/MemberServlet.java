package Servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {

  static ArrayList<Member> al = new ArrayList<>();
  static HashMap<Integer, Member> hm = new HashMap<>();
  static int num = 1;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String id = req.getParameter("id");
    String password1 = req.getParameter("password1");
    String password2 = req.getParameter("password2");
    String name = req.getParameter("name");

    if (password1 != "" && password1.equals(password2)){
      Member member = new Member(id,name,password1);
      al.add(member);
      hm.put(num++,member);

      req.setAttribute("al", al);
      req.setAttribute("hm", hm);
      req.getRequestDispatcher("member.jsp").forward(req,resp);
    } else {
      req.setAttribute("errorMessage", "비밀번호가 일치하지 않습니다.");
      req.getRequestDispatcher("memberJoin.jsp").forward(req,resp);
    }


  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  }
}
