package edu.bu.met.cs665.EmailGeneration;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This interface defines the Creator for the Factory Method pattern.
 */
public interface Factory {

    /**
     * Method creates a Customer.
     *
     * @param customerType - the type of customer
     * @return a customer
     */
    public Customer createCustomer(String customerType);
}
