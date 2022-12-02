package edu.bu.met.cs665.EmailGeneration;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class defines the ConcreteProduct of the Factory Method pattern.
 */
public class Frequent extends Customer {

    /**
     * Method creates a unique email for Frequent customers.
     *
     * @return a custom email for Frequent customers
     */
    @Override
    public String createEmail() {
        email.setEmailSubject("REWARD!");
        email.setEmailBody("Thanks for being our loyal customer!");
        email.setEmailClosing("Sincerely, Flourish and Blotts");
        return email.toString();
    }
}
