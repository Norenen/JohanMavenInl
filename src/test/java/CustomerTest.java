import models.Customer;
import org.junit.jupiter.api.Test;
import utilities.GenderType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    //G
    @Test
    void testGetGender() {
        Customer customer = new Customer("Idk", "Johan", "Norén", "Haegerströms väg 87G", "0733123223", "jnoren01@gmail.com", 1, GenderType.MALE);

        assertEquals(GenderType.MALE, customer.getGender());
    }

    //G
    @Test
    void testGetMailingName() {
        Customer customer = new Customer("Idk", "Johan", "Norén", "Haegerströms väg 87G", "0733123223", "jnoren01@gmail.com", 1, GenderType.MALE);
        assertEquals("Idk J Norén", customer.getMailingName());
    }


}
