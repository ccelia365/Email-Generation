package edu.bu.met.cs665.EmailGeneration;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class defines the ConcreteProduct of the Factory Method pattern.
 */
public class VIP extends Customer {

    /**
     * Method creates a unique email for VIP customers.
     *
     * @return a custom email for VIP customers
     */
    @Override
    public String createEmail() {
        email.setEmailSubject("EXCLUSIVE REWARD!");
        email.setEmailBody("Thanks for being our VIP! Please checkout our site for exclusive offers!");
        email.setEmailClosing("Sincerely, Flourish and Blotts");
        return email.toString();
    }
}
