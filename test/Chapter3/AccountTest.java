package Chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;
    @BeforeEach
    void setUp() {account = new Account("Titi", 1234);
    }

    @AfterEach
    void tearDown() {
    }

  @Test
    void testAccountObjectShouldBeInitializedWithValues() {
       Account account = new Account("Titi", 1234);
       assertEquals("Titi", account.getName());
       assertEquals(1234, account.getPin());
       assertEquals(0.0, account.getBalance());
    }

    @Test
    void testAccountShouldHaveAccountName(){
    account.setName("Mary");
    assertEquals("Mary", account.getName());
    }

    @Test
    void testUserShouldBeAbleToGetBalance(){
        double balance = account.getBalance();
        assertEquals(0.0, balance);
    }

    @Test
    void testDepositMethodShouldIncreaseBalance(){
        account.deposit(100.00);
        assertEquals(100.00, account.getBalance());
    }

    @Test
    void testThatUserCannotWithdrawMoreThanBalance(){
        account.deposit(100.00);
        account.withdraw(150.00);
        assertEquals(100.00, account.getBalance());
    }

    @Test
    void testThatUserShouldBeAbleToChangePin(){
        account.changePin(1200, 1234);
        assertEquals(1200, account.getPin());

        }
    }
