package edu.bu.met.cs665.EmailGeneration;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class defines the ConcreteProduct of the Factory Method pattern.
 */
public class New extends Customer {

    /**
     * Method creates a unique email for New customers.
     *
     * @return a custom email for New customers
     */
    @Override
    public String createEmail() {
        email.setEmailSubject("WELCOME TO OUR BOOKSTORE!");
        email.setEmailBody("Thanks for becoming our customer. Please feel free to browse our collections.");
        email.setEmailClosing("Sincerely, Flourish and Blotts");
        return email.toString();
    }
}
