package controller.function;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterCommand implements Command {
@Override
public String execute(HttpServletRequest req, HttpServletResponse resp) {
String id = req.getParameter("id");
String pass = req.getParameter("pass");
String nextPage = "/index.jsp";
// loginServlet에서 처리해야할 내용…..
return nextPage;
}
}
