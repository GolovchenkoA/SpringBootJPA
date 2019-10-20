package ua.art.demo.dao;

import org.springframework.data.repository.CrudRepository;
import ua.art.demo.model.Email;

public interface EmailRepository extends CrudRepository<Email, Long> {
}
