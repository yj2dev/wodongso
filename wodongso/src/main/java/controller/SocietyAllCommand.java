package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Society;

public class SocietyAllCommand implements Command{
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/wodongso?serverTimezone=UTC";
		String id = "root";
		String pw = "1114";
		String sql = "SELECT * FROM society";
		
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(url, id, pw);
		    System.out.println("Success");
		} catch(Exception e) { 
		    e.printStackTrace();
		}


		Statement stmt = null;
		ResultSet rs = null;

		
		List<Society> societyList = new ArrayList<>(); 
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int number = rs.getInt("number");
				String name = rs.getString("name");
				String type = rs.getString("type");
				String category = rs.getString("category");
				String position = rs.getString("position");
				String profile_url = rs.getString("profile_url");
				String background_url = rs.getString("background_url");
				String simple_desc = rs.getString("simple_desc");
				String detail_desc = rs.getString("detail_desc");	
				
				Society society = new Society(
						number,
						name,
						type,
						category,
						position,
						profile_url,
						background_url,
						simple_desc,
						detail_desc
						);
							
				societyList.add(society);
			}
			
			stmt.close();
			rs.close();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("societyList", societyList);
		
		try {
		
			req.getRequestDispatcher("/landing.jsp").forward(req, res);
		} catch(Exception e) { 
		    e.printStackTrace();
		}
	
		
		
		return null;

	}
}


