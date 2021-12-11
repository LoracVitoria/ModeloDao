package app;

import java.io.IOException;
import java.util.List;
import dao.DaoFactory;
import dao.SellerDao;
import models.Department;
import models.Seller;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/find")
public class FindDepartment extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		System.out.println("======= TESTE 1 (findById)  ============");
		SellerDao dao = DaoFactory.createSellerDao();
		
		Seller seller = dao.findById(2);



		System.out.println(seller);
		
		
		
		System.out.println("======= TESTE 2 (findByDepartment) ============");
		
		List<Seller> sellers = dao.findByDepartment(new Department(1, null));
		
		for (Seller s : sellers) {
			System.out.println(s);
		}
		
	}

}
