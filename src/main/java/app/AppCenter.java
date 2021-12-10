package app;

import dao.DepartmentDaoJDBC;
import models.Department;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"","/center"})
public class AppCenter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {


        DepartmentDaoJDBC dao = new DepartmentDaoJDBC();
        List<Department> deps = dao.findAll();

        req.setAttribute("deps", deps);


        RequestDispatcher dispatcher = req.getRequestDispatcher("HomePageServlet.jsp") ;
        dispatcher.forward(req, resp);



    }
}