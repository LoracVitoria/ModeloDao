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

@WebServlet("/update")
public class AppUpdate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		Connection conn = ConnectionFactory.getConnection();
		
		try {
			
			conn.setAutoCommit(false);
			
			PreparedStatement st = conn.prepareStatement(""
					+ "UPDATE seller SET BaseSalary = BaseSalary + ? WHERE DepartmentId = ?");
			
			st.setDouble(1, 200);
			st.setInt(2, 4);
			
			st.executeUpdate();
			
			
			if( 2 > 1) {
				throw new SQLException("Fake Error");
			}
			
			
			PreparedStatement st2 = conn.prepareStatement(""
					+ "UPDATE seller SET BaseSalary = BaseSalary + ? WHERE DepartmentId = ?");
			
			st2.setDouble(1, 500);
			st2.setInt(2, 1);
			
			st2.executeUpdate();
			
			conn.commit();
			
		
		} catch (SQLException e) {
			
			try {
				conn.rollback();
				throw new DatabaseException("problema de transacao");
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		
	}

}
