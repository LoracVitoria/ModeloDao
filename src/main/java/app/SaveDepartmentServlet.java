package app;

import connection.ConnectionFactory;
import dao.DaoFactory;
import dao.DepartmentDao;
import dao.DepartmentDaoJDBC;
import dao.SellerDao;
import models.Department;
import models.Seller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet("/savedepartment")
public class SaveDepartmentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String name =  req.getParameter("field_name_department");
            Department dep = new Department();
            dep.setName(name);
            System.out.println("Departamento salvo!");
            DepartmentDaoJDBC dao = new DepartmentDaoJDBC();
            //inserir no banco de dados
            dao.insert(dep);

            RequestDispatcher dispatcher = req.getRequestDispatcher("InsertServlet.jsp") ;
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
