package com.nt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;



import com.nt.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		int sal = rs.getInt("sal");
		Employee e = new Employee(id, name, sal);
		return e;
	}
}
