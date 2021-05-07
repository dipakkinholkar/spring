package com.dipak.server;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dipak.dao.DBConnection;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/fetch")
public class Product extends HttpServlet {
	
	List<Integer> proId=new ArrayList<Integer>();
	List<String> proName=new ArrayList<String >();
	List<Integer> proPrice=new ArrayList<Integer>();
	
    /**
     * Default constructor. 
     */
    public Product() {
    	System.out.print("constructor started");
    	
    	
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			 
			 PrintWriter pw=response.getWriter();
			 
				Connection con=DBConnection.getConnection();
			
				
				response.setContentType("text/html");
				
				String sql = "select * from prolist";
				
				Statement s=con.createStatement();
				
				ResultSet rs=null;
				
				s.executeQuery (sql);

				  rs = s.getResultSet();

				  while (rs.next ()){
					  
					  int proid=rs.getInt(1);
					  String proname=rs.getString(2);
					  int proprice=rs.getInt(3);
					  
					  proId.add(proid);
					  proName.add(proname);	
					  proPrice.add(proprice);
					  
						
								  }

				  pw.print("<h1>"+proId+"</h1>");  
				  pw.print("<h1>"+proName+"</h1>");
				  pw.print("<h1>"+proPrice+"</h1>");
				  
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	
	

}
