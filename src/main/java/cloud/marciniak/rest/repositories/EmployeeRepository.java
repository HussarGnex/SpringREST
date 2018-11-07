package cloud.marciniak.rest.repositories;

import cloud.marciniak.rest.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
