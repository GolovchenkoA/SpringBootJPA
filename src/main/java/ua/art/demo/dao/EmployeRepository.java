package ua.art.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.art.demo.model.Employee;

@Repository
public interface EmployeRepository extends CrudRepository<Employee, Long> {
}
