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
				+ "(id, name, nickname, password, type, contact, profile_url, region, university, major, class_of)"
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		String url = "jdbc:mysql://localhost:3306/wodongso?serverTimezone=UTC";
		String id = "root";
		String pw = "1114";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con = DriverManager.getConnection(url, id, pw);
	
		PreparedStatement stmt = con.prepareStatement(sql);
	

		
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

		User user = new User(userId, name, nickname, password, type, contact, profile_url, region, university, major, classOf);
		
		System.out.println(user.toString());
		 
		stmt.setString(1, user.getId());
		stmt.setString(2, user.getName());
		stmt.setString(3, user.getNickname());
		stmt.setString(4, user.getPassword());
		stmt.setInt(5, user.getType());
		stmt.setString(6, user.getContact());
		stmt.setString(7, user.getProfile_url());
		stmt.setString(8, user.getRegion());
		stmt.setString(9, user.getUniversity());
		stmt.setString(10, user.getMajor());
		stmt.setString(11, user.getClassOf());		
		
		int rs = stmt.executeUpdate();
		System.out.println("result >> " + rs);
		
		stmt.close();
		con.close();
		
		try {
			req.getRequestDispatcher("/landing.jsp").forward(req, res);
		} catch(Exception e) { 
		    e.printStackTrace();
		}
			
		return null;

	}
}
