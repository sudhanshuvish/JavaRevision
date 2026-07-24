package com.vish.SpringJDBCExample2;

import com.vish.SpringJDBCExample2.model.Employee;
import com.vish.SpringJDBCExample2.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExample2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExample2Application.class, args);

		Employee e = context.getBean(Employee.class);

		e.setId(101);
		e.setName("Jade");
		e.setSal(98700);

		EmployeeService service = context.getBean(EmployeeService.class);

		service.addEmployee(e);

		service.getAllEmp().forEach(n-> System.out.println(n.getId()+" : "+n.getName()+" : "+n.getSal()));





	}

}
