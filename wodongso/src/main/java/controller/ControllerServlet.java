package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jdbc.pool.DataSource;

@WebServlet("*.do")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CommandHandler cmdHandler;
//	DataSource dataSource;

	public void init() throws ServletException {
		super.init();
		cmdHandler = new CommandHandler();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		doPost(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
			String requestURI = req.getRequestURI();
			String contextPath = req.getContextPath();
			String cmd = requestURI.substring(contextPath.length() + 1, requestURI.indexOf(".do"));
			System.out.println("cmd: " + cmd);
			String nextPage = cmdHandler.getCommand(cmd).execute(req, res);
			req.getServletContext().getRequestDispatcher(nextPage).forward(req, res);
	}

}
