package ua.art.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.art.demo.dao.EmployeRepository;
import ua.art.demo.model.Employee;
import ua.art.demo.service.EmployeService;

@SpringBootApplication
@EnableJpaRepositories("ua.art.demo.dao")
//@EntityScan("ua.art.demo.model)
public class DemoApplication {



	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

//		Employee e = Employee.builder().id(1).firstName("Name").lastName("LastName").build();
//
//		service.save(e);

	}

}
