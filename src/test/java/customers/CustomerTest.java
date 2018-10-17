package customers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    @Before
    public void before(){
        customer = new Customer(20000, "Buy", "Regular");
    }

    @Test
    public void hasMoney(){
        assertEquals(20000, customer.getMoney(), 0.01);
    }

    @Test
    public void hasIntention(){
        assertEquals("Buy", customer.getIntention());
    }

    @Test
    public void hasCarTypePreference(){
        assertEquals("Regular", customer.getCartypepreference());
    }

    @Test
    public void canSpendMoney(){
        customer.spendMoney(10000);
        assertEquals(10000, customer.getMoney(), 0.01);
    }
}
