package app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import connection.ConnectionFactory;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class AppInsert extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		Connection conn = ConnectionFactory.getConnection();
		
		try {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
			PreparedStatement st = conn.prepareStatement(""
					+ "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "Jefferson");
			st.setString(2, "jefferson.chaves@ifpr.edu.br");
			st.setDate(3, new java.sql.Date(dateFormat.parse("26/04/1989").getTime()));
			st.setDouble(4, 10000);
			st.setInt(5, 1);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("linhas afetadas: " + rowsAffected);
			
			//Obter os ids ou id inseridos
			ResultSet ids = st.getGeneratedKeys();
			
			ids.next();
			Integer id = ids.getInt(1);
			
			System.out.println("O id inserido foi: " + id);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
