package controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;


public class RegisterCommand implements Command {
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		req.setCharacterEncoding("UTF-8");
		Connection con = null;
		String sql = "INSERT INTO user"
				+ "(id, name, password, type, profile_url, region, university, major, class_of)"
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		String url = "jdbc:mysql://localhost:3306/wodongso?serverTimezone=UTC";
		String id = "root";
		String pw = "1114";
	
		System.out.println("sql >> " + sql);

		Class.forName("com.mysql.cj.jdbc.Driver");
	    con = DriverManager.getConnection(url, id, pw);
	
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = null;

		
		String userId = (String) req.getParameter("id");
		String name = (String) req.getParameter("name");
		String nickname = (String) req.getParameter("nickname");
		String password = (String) req.getParameter("password");
		String passwordCheck = (String) req.getParameter("passwordCheck");
		int type = Integer.parseInt(req.getParameter("type"));
		String contact = (String) req.getParameter("contact");
		String profile_url = "";
		String region = (String) req.getParameter("region");
		String university = (String) req.getParameter("university");
		String major = (String) req.getParameter("major");
		String classOf = (String) req.getParameter("classOf");

	
		System.out.println("userId >> " + userId);
		System.out.println("region" + region);
		System.out.println("university >> " + university);
		System.out.println("major >> " + major);
		System.out.println("classOf >> " + classOf);
		
		if(!password.equals(passwordCheck)) {
			System.out.println("비밀번호 불일치");
			
			PrintWriter out = res.getWriter();
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			
			out.write("<h3>check password</h3>");
//			out.write("<script>alert('plz check pw...');</script>");
			
//			req.getRequestDispatcher("/register.jsp").forward(req, res);
			
		} else {
			System.out.println("비밀번호 일치");
			req.getRequestDispatcher("/index.jsp").forward(req, res);
		}
	
		User user = new User(userId, name, nickname, password, type, contact, profile_url, region, university, major, classOf);
		
		System.out.println(user.toString());
		 
		
		
		stmt.setString(1, user.getId());
		stmt.setString(2, user.getName());
		stmt.setString(3, user.getPassword());
		stmt.setInt(4, user.getType());
		stmt.setString(5, user.getProfile_url());
		stmt.setString(6, user.getRegion());
		stmt.setString(7, user.getUniversity());
		stmt.setString(8, user.getMajor());
		stmt.setString(9, user.getClassOf());
		
		
		int result = stmt.executeUpdate();
		System.out.println("result >> " + result);
		
		
		stmt.close();
//		rs.close();
		con.close();
		
		
//		PrintWriter out = res.getWriter();
//		out.prinln();
		
		
		try {
			req.getRequestDispatcher("/landing.jsp").forward(req, res);
		} catch(Exception e) { 
		    e.printStackTrace();
		}
			
		return null;

	}
}
