package dao;

import connection.ConnectionFactory;
import models.Department;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		
		SellerDao dao = new SellerDaoJDBC(ConnectionFactory.getConnection());
		
		return dao;
		
	}

}
