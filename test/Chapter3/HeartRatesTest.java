package Chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {
    HeartRates heartRates;


    @BeforeEach
    void setUp() {
        heartRates  = new HeartRates("John", "Tunde", 12, 4, 1998);

    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void CheckThatConstructorCanInitialiseFirstNameLastNameAndDateOfBirth(){
        heartRates  = new HeartRates("John", "Tunde", 12, 4, 1998);


    }
    @Test
    void CheckThatClassCanSetAndGetFirstName(){
        heartRates.setFirstName("David");
        assertEquals("David", heartRates.getFirstName());
    }

    @Test
    void CheckThatClassCanSetAndGetLastName(){
        heartRates.setLastName("Paul");
        assertEquals("Paul", heartRates.getLastName());
    }

    @Test
    void CheckThatClassCanSetAndGetDay(){
        heartRates.setDay(15);
        assertEquals(15, heartRates.getDay());
    }

    @Test
    void CheckThatClassCanSetAndGetMonth(){
        heartRates.setMonth(7);
        assertEquals(7, heartRates.getMonth());

    }

    @Test
    void CheckThatClassCanSetAndGetYear(){
        heartRates.setYear(2010);
        assertEquals(2010, heartRates.getYear());
    }

    @Test
    void CheckThatClassCanReturnPersonsAgeInYears(){
        heartRates.setYear(2010);
        System.out.println(heartRates.getYear());
        assertEquals(10,  heartRates.getAge (heartRates.getYear()));
    }
  @Test
    void CheckThatClassCanCalculateMinimumHeartRate(){
      heartRates.setYear(2010);
      int age = heartRates.getAge(heartRates.getYear());
        assertEquals(210, heartRates.getMaximumHeartRate(age));

  }

  @Test
    void CheckThatClassCanCalculateAndReturnPersonsTargetHeartRate(){

        heartRates.setYear(2010);
        int year = heartRates.getYear();
        int age = heartRates.getAge(year);
        int maximumHeartRate = heartRates.getMaximumHeartRate(age);
        heartRates.calculateTargetHeartRate(maximumHeartRate);
        assertEquals(105, heartRates.calculateTargetHeartRate(maximumHeartRate));

  }


}