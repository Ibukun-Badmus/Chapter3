package Chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
  void CheckThatConstructorCanInitialiseMonthDayAndYearOfADateAndAssumeThatTheValuesAreCorrect(){
        Date date = new Date(4, 3, 2020);

    }

    @Test
    void CheckThatDateCanSetAndGetMonth(){
        Date date = new Date(4, 3, 2020);
        date.setMonth(4);
        System.out.println(date.getMonth());
        assertEquals(4, date.getMonth());
    }

    @Test
    void CheckThatDateCanSetAndGetDay(){
        Date date = new Date(4, 3, 2020);
        date.setDay(3);
        System.out.println(date.getDay());
        assertEquals(3, date.getDay());

    }

    @Test
    void CheckThatDateCanSetAndGetYear(){
        Date date = new Date(4, 3, 2020);
        date.setYear(2020);
        System.out.println(date.getYear());
        assertEquals(2020, date.getYear());

    }

    @Test
    void checkThatDateCanDisplayMonthDayAndYear(){
        Date date = new Date(4, 3, 2020);
        String monthDayYear = date.displayMonthDayYear();
        assertEquals("4/3/2020", monthDayYear);


    }
}