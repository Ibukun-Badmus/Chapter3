package Chapter3;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

@SuppressWarnings("deprecation")
public class EmployeeTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void checkThatConstructorCanInitialiseLastName() {
        Employee employee = new Employee("Bayo", "Tunde", 50);
    }

    @Test
    void CheckThatConstructorCanInitialiseMonthlySalary() {
        Employee employee = new Employee("Bayo", "Tunede", 4000);
        assertNotNull(employee.getMonthlySalary());
    }

    @Test
    void CheckThatObjectCanHaveYearlySalary() {
        Employee employee = new Employee("Bayo", "Tunede", 4000);
        employee.yearlySalary();
        double sum = employee.getYearlySalary();
        assertEquals(48000.00, sum);
    }

    @Test
    void checkThatMonthlySalaryDoNotReceiveNegativeValue() {
        Employee employee = new Employee("Bayo", "Tunede", 4000);
        employee.setMonthlySalary(0);
        System.out.println(employee.getMonthlySalary());
        assertEquals(4000.00, employee.getMonthlySalary());
    }

}