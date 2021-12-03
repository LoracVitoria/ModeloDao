package app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("")
public class AppCreate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		HttpSession session = req.getSession(false);


			//ConnectionFactory connFactory = new ConnectionFactory();

			Connection conn = ConnectionFactory.getConnection();


			try {

				Statement stmt = conn.createStatement();

				ResultSet result = stmt.executeQuery("SELECT * FROM department;");

				while (result.next()) {

					Integer id = result.getInt("Id");
					String name = result.getString("Name");

					System.out.println("id: " + id + " nome:" + name);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}


