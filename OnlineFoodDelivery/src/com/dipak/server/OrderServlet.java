package com.dipak.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dipak.dao.DBConnection;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static PrintWriter pw=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 try {
				 
				 int custId=Integer.parseInt(request.getParameter("custId"));
				 String custName=request.getParameter("custName");
				 Long custMobile=Long.parseLong(request.getParameter("custName"));
				 String custEmail=request.getParameter("custEmail");
				 String custAddress=request.getParameter("custAddress");
				 Long proQuantity=Long.parseLong(request.getParameter("custQuanity"));
				 String proName=request.getParameter("proName");
				 Long proPrice=Long.parseLong(request.getParameter("proPrice"));
				
				 
				 
				  pw=response.getWriter();
				 
					Connection con=DBConnection.getConnection();
				
					
					response.setContentType("text/html");
					
					
							
					
				
					PreparedStatement st = con
.prepareStatement("insert into orderlist values(?,?,?,?,?,?,?,?)");
			  
			            // For the first parameter,
			            // get the data using request object
			            // sets the data to st pointer
			            st.setInt(1, Integer.valueOf(request.getParameter("custId")));
			  
			            // Same for second parameter
			            st.setString(2, request.getParameter("custName"));
			            
			            
			            st.setLong(3, Long.valueOf(request.getParameter("custMobile")));
			            st.setString(4, request.getParameter("custEmail"));
			            st.setString(5, request.getParameter("custAddress"));
			            st.setInt(6, Integer.valueOf(request.getParameter("proQuantity")));
			            st.setString(7, request.getParameter("proName"));
			            st.setInt(8, Integer.valueOf(request.getParameter("proPrice")));
						  
			            
			            
			            
			            // Execute the insert command using executeUpdate()
			            // to make changes in database
			            st.executeUpdate();
			  
			            // Close all the connections
			            st.close();
			            con.close();
			  
					
					
					
					
				
					
					
					

					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		
		
		
		
		}

}
