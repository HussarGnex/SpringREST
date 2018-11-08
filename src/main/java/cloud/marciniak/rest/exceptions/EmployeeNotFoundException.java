package cloud.marciniak.rest.exceptions;

public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(Long id) {
        super("Couldn't find employee with id -> " + id);
    }
}
