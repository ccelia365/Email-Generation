package edu.bu.met.cs665.EmailGeneration;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class defines the ConcreteProduct of the Factory Method pattern.
 */
public class Business extends Customer {

    /**
     * Method creates a unique email for Business customers.
     *
     * @return a custom email for Business customers
     */
    @Override
    public String createEmail() {
        email.setEmailSubject("BUSINESS ORDER CONFIRMATION");
        email.setEmailBody("Thanks for your order!");
        email.setEmailClosing("Sincerely, Flourish and Blotts");
        return email.toString();
    }
}
