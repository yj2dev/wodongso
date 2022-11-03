package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements Command {
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		req.setCharacterEncoding("UTF-8");
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/wodongso?serverTimezone=UTC";
		String id = "root";
		String pw = "1114";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, id, pw);
		
		Statement stmt = con.createStatement();
		ResultSet rs = null;

		String userId = req.getParameter("id");
		String password = req.getParameter("password");
		System.out.println(userId + password);
		
		String sqlIdCheck= "SELECT * FROM user WHERE id = '" + userId + "'";
		rs = stmt.executeQuery(sqlIdCheck);
		System.out.println("sqlIdCheck reseult >> " + rs);
	
		while(rs.next()) {
			System.out.println("sqlIdCheck reseult >> " + rs);
			System.out.println("sqlIdCheck reseult id >> " + rs.getString("id"));
			System.out.println("sqlIdCheck reseult password >> " + rs.getString("password"));
		
		}
		
		
		System.out.println("id >> " + id);
		System.out.println("password >> " + password);
		
		
		
		String nextPage = "/login.jsp";
		return nextPage;
	}
}
