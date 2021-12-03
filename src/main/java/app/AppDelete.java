package app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.ConnectionFactory;
import exceptions.DatabaseException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class AppDelete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		Connection conn = ConnectionFactory.getConnection();
		
		try {
			
			PreparedStatement st = conn.prepareStatement(""
					+ "DELETE FROM department WHERE Id = ?");
			
			st.setInt(1, 1);
			
			st.executeUpdate();
		
		
		} catch (SQLException e) {
			
			throw new DatabaseException(e.getMessage());
			
		}
		
		
		
		
	}
	
}
