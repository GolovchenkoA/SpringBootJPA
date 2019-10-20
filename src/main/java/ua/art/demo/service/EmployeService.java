package ua.art.demo.service;

import org.springframework.stereotype.Service;
import ua.art.demo.dao.EmployeRepository;
import ua.art.demo.model.Employee;

@Service
public class EmployeService {


    private final EmployeRepository repository;

    public EmployeService(EmployeRepository repository) {
        this.repository = repository;
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public Iterable<Employee> findAll() {
        return repository.findAll();
    }
}
