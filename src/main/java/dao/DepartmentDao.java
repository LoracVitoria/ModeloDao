package dao;

import java.sql.SQLException;
import java.util.List;

import models.Department;

public interface DepartmentDao {
	
	public void insert(Department department);
	
	public void update(Department department);
	
	public void deleteById(Integer id);
	
	public Department findById(Integer id);
	
	public List<Department> findAll() throws SQLException;
	
}
