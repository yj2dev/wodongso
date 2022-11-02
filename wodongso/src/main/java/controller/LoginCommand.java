package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements Command {
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String nextPage = "/login.jsp";

		
		// loginServlet에서 처리해야할 내용…..
		System.out.println("login...");
		System.out.println("id >> " + id);
		System.out.println("password >> " + password);
		
		return nextPage;
	}
}
