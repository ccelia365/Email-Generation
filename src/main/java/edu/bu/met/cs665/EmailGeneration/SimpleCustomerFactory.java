package edu.bu.met.cs665.EmailGeneration;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class defines the ConcreteCreator for the Factory Method pattern.
 */
public class SimpleCustomerFactory implements Factory {

    /**
     * This method creates the customer based on the type of customer.
     *
     * @param customerType - the type of customer
     * @return a customer
     */
    @Override
    public Customer createCustomer(String customerType) {
        if (customerType.equalsIgnoreCase("Business")) {
            return new Business();
        } else if (customerType.equalsIgnoreCase("Returning")) {
            return new Returning();
        } else if (customerType.equalsIgnoreCase("Frequent")) {
            return new Frequent();
        } else if (customerType.equalsIgnoreCase("New")) {
            return new New();
        } else if (customerType.equalsIgnoreCase("VIP")) {
            return new VIP();
        } else {
            return null;
        }
    }
}
