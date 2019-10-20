package ua.art.demo.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.art.demo.model.Email;
import ua.art.demo.model.Employee;
import ua.art.demo.service.EmployeService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest()
class EmployeRepositoryTest {

    @Autowired
    private EmployeService service;
    @Autowired
    private EmailRepository emailRepository;


    @Test
    public void save() {
        //Employee e = Employee.builder().id(1).firstName("Name").lastName("LastName").build();

        Employee employee = Employee.builder().build();

        employee.setId(1);
        employee.setFirstName("Name");
        employee.setLastName("LastName");


        service.save(employee);

        System.out.println("Employee has been saved");


        Email email1 = Email.builder().employee(employee).email("email1").build();
        Email email2 = Email.builder().employee(employee).email("email1").build();

        //TODO: this must do service
        Set<Email> emails = new HashSet<>(Arrays.asList(new Email[]{email1, email2}));
        emailRepository.saveAll(emails);

       // employee.setEmails(emails);


        Iterable<Employee> all = service.findAll();

        System.out.println("All employees has found");

        System.out.println(all);

        for(Employee e: all) {
            System.out.println(e.getEmails());
        }

        // Found
//        Iterable<Email> allEmails = emailRepository.findAll();
//        System.out.println(allEmails);
    }

}