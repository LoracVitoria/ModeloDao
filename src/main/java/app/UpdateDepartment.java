package app;

import dao.DepartmentDaoJDBC;
import models.Department;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateDepartment extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp){

			Integer id = Integer.parseInt(req.getParameter("field_id_department"));
			String name = req.getParameter("field_name_department");
			Department depa;
			DepartmentDaoJDBC dao = new DepartmentDaoJDBC();

			depa = dao.findById(id);
			depa.setName(name);
			if(depa==null){
				System.out.println("não encontrado");
			}else{
				dao.update(depa);
			}
		}
		
	}


