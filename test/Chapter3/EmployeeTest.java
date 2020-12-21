package Chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatConstructorCanInitialiseFirstNameLastNameMonthlySalary() {
        Employee employee = new Employee("Tunde", "Wale", 300.00);
    }

    @Test
    void checkThatClassCanSetAndGetFirstName() {
        Employee employee = new Employee("Tunde", "Wale", 300.00);
        employee.setFirstName("Tunde");
        employee.getFirstName();
        assertEquals("Tunde", employee.getFirstName());
    }

    @Test
    void checkThatClassCanSetAndGetLastName() {
        Employee employee = new Employee("Tunde", "Wale", 300.00);
        employee.setLastName("Wale");
        employee.getLastName();
        assertEquals("Wale", employee.getLastName());

    }

    @Test
    void checkThatClassCanSetAndGetMonthlySalary() {
        Employee employee = new Employee("Tunde", "Wale", 300.00);
        employee.setMonthlySalary(300.00);
        employee.getMonthlySalary();
        assertEquals(300.00, employee.getMonthlySalary());
    }

    @Test
    void checkThatMonthlySalaryCannotReceiveNegativeValue() {
        Employee employee = new Employee("Tunde", "Wale", 300.00);
        employee.setMonthlySalary(0);
        System.out.println(employee.getMonthlySalary());
        assertEquals(300, employee.getMonthlySalary());
    }

    @Test
    void checkThatObjectCanHaveYearlySalary() {
        Employee employee = new Employee("Tunde", "Wale", 300.00);
        employee.getYearlySalary();
        System.out.println(employee.getYearlySalary());
        assertEquals(3600.00, employee.getYearlySalary());

    }

    @Test
    void checkThatEmployee1CanReceiveTenPercentRaise(){
        Employee employee = new Employee("Tunde", "Wale", 300.00);
        Employee employee1 = new Employee("Kenny", "Joe", 500.00);
        Employee employee2 = new Employee("Ovie", "Joseph", 800.00);
        employee1.getTenPercentRaise();
        System.out.println(employee1.getTenPercentRaise());
        assertEquals(50.00, employee1.getTenPercentRaise());

    }

    @Test
    void checkThatEmployee2CanReceiveTenPercentRaise(){
        Employee employee = new Employee("Tunde", "Wale", 300.00);
        Employee employee1 = new Employee("Kenny", "Joe", 500.00);
        Employee employee2 = new Employee("Ovie", "Joseph", 800.00);
        employee2.getTenPercentRaise();
        System.out.println(employee2.getTenPercentRaise());
        assertEquals(80.0, employee2.getTenPercentRaise());
    }

}