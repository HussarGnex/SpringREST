package cloud.marciniak.rest.repositories;

import cloud.marciniak.rest.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
