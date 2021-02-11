package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatUserCanBeSet(){
        String name = "Andrei";
        SalaryCalculator myCalculator = new SalaryCalculator("Andrei", 400, 4);

        myCalculator.setUser(name);
        assertEquals(name, myCalculator.getUser());

    }

    @Test
    void testThatUserCanSetAndGetHourlyRate(){
        int hourlyRate = 400;
        SalaryCalculator myCalculator = new SalaryCalculator("Andrei", 400, 4);

        myCalculator.setHourlyRate(hourlyRate);
        assertEquals(hourlyRate, myCalculator.getHourlyRate());

    }

    @Test
    void testThatUserCanSetAndGetHoursWorked(){
        int hoursWorked = 4;
        SalaryCalculator myCalculator = new SalaryCalculator("Andrei", 400, 4);

        myCalculator.setHoursWorked(hoursWorked);
        assertEquals(hoursWorked, myCalculator.getHoursWorked());

    }

    @Test
    void testThatClassCanCalculateGrossPay(){
        SalaryCalculator myCalculator = new SalaryCalculator("Andrei", 400, 4);
        myCalculator.grossPay();
        assertEquals(1600, myCalculator.grossPay());


    }
    @Test
    void testThatClassUserCanHaveOvertime(){
        SalaryCalculator myCalculator = new SalaryCalculator("Andrei", 400, 70);
        myCalculator.grossPay();
        assertEquals(1800.0, myCalculator.grossPay());

    }
}
