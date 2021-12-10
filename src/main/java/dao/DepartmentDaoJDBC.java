package dao;

import connection.ConnectionFactory;
import models.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao{

    private Connection connection;

    public DepartmentDaoJDBC() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void insert(Department department) {
        try {
            PreparedStatement st = null;

            st = connection.prepareStatement(""
                    + "INSERT INTO department (Name)"
                    + "VALUES(?)", Statement.RETURN_GENERATED_KEYS);


            st.setString(1, department.getName());

            int rowsAffected = st.executeUpdate();

            System.out.println("linhas afetadas: " + rowsAffected);

            //Obter os ids ou id inseridos
            ResultSet ids = st.getGeneratedKeys();

            ids.next();
            Integer id = ids.getInt(1);

            System.out.println("O id inserido foi: " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {

        List<Department> departments = new ArrayList<>();

        ResultSet resultSet = null;



        try {

            String sql = "SELECT * FROM department";
            PreparedStatement statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()){
                Integer id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                Department dep = new Department();
                dep.setId(id);
                dep.setName(name);
                departments.add(dep);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }
        return departments;
    }
}
