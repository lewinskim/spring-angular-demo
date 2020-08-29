package home.tutorials.springangular.repository;

import home.tutorials.springangular.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
