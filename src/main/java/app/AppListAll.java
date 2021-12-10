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

@WebServlet("/findall")
public class AppListAll extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println("======= TESTE 1 (findAll)  ============");
        SellerDao dao = DaoFactory.createSellerDao();
        List<Seller> sellers = dao.findAll();
        for (Seller s : sellers) {
            System.out.println(s);
        }

    }

}
