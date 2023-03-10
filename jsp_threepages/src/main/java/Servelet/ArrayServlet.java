package Servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/array")
public class ArrayServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String[] menu = {req.getParameter("menu1"),req.getParameter("menu2"),req.getParameter("menu3")};
    req.setAttribute("menu", menu);
    req.getRequestDispatcher("Array.jsp").forward(req, resp);
  }
}
