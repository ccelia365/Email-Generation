package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.EmailGeneration.Customer;
import edu.bu.met.cs665.EmailGeneration.Factory;
import edu.bu.met.cs665.EmailGeneration.SimpleCustomerFactory;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class tests the five different customer specific emails.
 */
public class TestEmailGeneration {

    Factory factory = new SimpleCustomerFactory();

    @Test
    public void testBusinessEmail() {
        Customer businessCustomer = factory.createCustomer("Business");

        String email = "\n" + "BUSINESS ORDER CONFIRMATION" + "\n" + "Thanks for your order!" + "\n" + "Sincerely, Flourish and Blotts";

        assertEquals(businessCustomer.createEmail(), email);

    }

    @Test
    public void testReturningEmail() {
        Customer returningCustomer = factory.createCustomer("Returning");

        String email = "\n" + "WELCOME BACK TO OUR BOOKSTORE!" + "\n" + "Thanks for becoming our customer again. " + "Checkout our latest collections!." + "\n" + "Sincerely, Flourish and Blotts";

        assertEquals(returningCustomer.createEmail(), email);

    }

    @Test
    public void testFrequentEmail() {
        Customer frequentCustomer = factory.createCustomer("Frequent");

        String email = "\n" + "REWARD!" + "\n" + "Thanks for being our loyal customer!" + "\n" + "Sincerely, Flourish and Blotts";

        assertEquals(frequentCustomer.createEmail(), email);


    }

    @Test
    public void testNewEmail() {
        Customer newCustomer = factory.createCustomer("New");

        String email = "\n" + "WELCOME TO OUR BOOKSTORE!" + "\n" + "Thanks for becoming our customer. Please feel free to browse our collections." + "\n" + "Sincerely, Flourish and Blotts";

        assertEquals(newCustomer.createEmail(), email);

    }

    @Test
    public void testVipEmail() {
        Customer vipCustomer = factory.createCustomer("VIP");

        String email = "\n" + "EXCLUSIVE REWARD!" + "\n" + "Thanks for being our VIP! Please checkout our site for exclusive offers!" + "\n" + "Sincerely, Flourish and Blotts";

        assertEquals(vipCustomer.createEmail(), email);

    }

}
