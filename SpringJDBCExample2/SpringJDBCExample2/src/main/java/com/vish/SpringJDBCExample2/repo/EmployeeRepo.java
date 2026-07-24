package com.vish.SpringJDBCExample2.repo;

import com.vish.SpringJDBCExample2.model.Employee;
import com.vish.SpringJDBCExample2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Employee e){

        String sql = "insert into employee (id, name, sal) values (?,?,?)";

        int row = jdbcTemplate.update(sql, e.getId(), e.getName(), e.getSal());

        System.out.println(row + " Row(s) Added");
    }

    public List<Employee> findAll(){
        String sql = "select * from employee";

//        RowMapper<Employee> mapper = new RowMapper<Employee>() {
//            @Override
//            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//                    Employee e = new Employee();
//                    e.setId(rs.getInt("id"));
//                    e.setName(rs.getString("name"));
//                    e.setSal(rs.getInt("sal"));
//
//                    return e;
//
//            }
//        };

        return jdbcTemplate.query(sql, (rs, rowNum)->{
                    Employee e = new Employee();
                    e.setId(rs.getInt("id"));
                    e.setName(rs.getString("name"));
                    e.setSal(rs.getInt("sal"));
                    return e;
                });
    }

}
