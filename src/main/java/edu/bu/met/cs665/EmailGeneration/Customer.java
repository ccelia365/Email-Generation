package edu.bu.met.cs665.EmailGeneration;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class creates a Customer. It defines the Product of the Factory Method pattern.
 * This abstract class will be extended to create different types of customer emails.
 */
public abstract class Customer {

    protected Email email = new Email();

    /**
     * Abstract method: Each child customer class must provide the functionality for creating the
     * customer specific email.
     *
     * @return the customer specific email
     */
    public abstract String createEmail();

}
