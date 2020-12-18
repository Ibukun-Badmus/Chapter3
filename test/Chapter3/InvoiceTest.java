package Chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatConstructorCanInitialiseNumberDescriptionQuantityPriceOfAnItem() {
        Invoice invoice = new Invoice("two", "pipes", 12, 600.00);
    }

    @Test
    void checkThatClassCanSetAndGetNumber() {
        Invoice invoice = new Invoice("two", "pipes", 12, 600.00);
        invoice.setNumber("two");
        System.out.println(invoice.getNumber());
        assertEquals("two", invoice.getNumber());

    }

    @Test
    void checkThatClassCanSetAndGetDescription() {
        Invoice invoice = new Invoice("two", "pipes", 12, 600.00);
        invoice.setDescription("pipes");
        System.out.println(invoice.getDescription());
        assertEquals("pipes", invoice.getDescription());
    }

    @Test
    void checkThatClassCanSetAndGetQuantity() {
        Invoice invoice = new Invoice("'two", "pipes", 12, 600.00);
        invoice.setQuantity(12);
        System.out.println(invoice.getQuantity());
        assertEquals(12, invoice.getQuantity());

    }
    @Test
    void checkThatClassCanSetAndGetPrice(){
        Invoice invoice = new Invoice ("two","pipes", 12, 600.00);
        invoice.setPrice(600.00);
        System.out.println(invoice.getPrice());
        assertEquals(600.00, invoice.getPrice());
    }

    @Test
    void checkThatClassCanGetInvoiceAmount(){
    Invoice invoice = new Invoice("two", "pipes", 12, 600.00);
        double amount = invoice.getInvoiceAmount();
        assertEquals(7200, amount);

    }
    @Test
    void CheckThatClassCannotTakeNegativeQuantity(){
        Invoice invoice = new Invoice("two", "pipes", 12, 600.00);
        invoice.setQuantity(0);
        System.out.println(invoice.getQuantity());
        assertEquals(0, invoice.getQuantity());
    }

    @Test
    void CheckThatClassCannotTakeNegativePrice(){
        Invoice invoice = new Invoice("two", "pipes", 12,600.00);
        invoice.setPrice(0.0);
        System.out.println(invoice.getPrice());
        assertEquals(0.0, invoice.getPrice());
    }
}