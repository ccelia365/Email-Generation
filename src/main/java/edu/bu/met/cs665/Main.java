package edu.bu.met.cs665;

import edu.bu.met.cs665.EmailGeneration.Customer;
import edu.bu.met.cs665.EmailGeneration.Factory;
import edu.bu.met.cs665.EmailGeneration.SimpleCustomerFactory;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class outputs the five unique customer specific emails based on five specific
 * customer types to the console.
 */
public class Main {

    public static void main(String[] args) {

        Factory factory = new SimpleCustomerFactory();

        //Creating different customers
        Customer businessCustomer = factory.createCustomer("Business");
        Customer returningCustomer = factory.createCustomer("Returning");
        Customer frequentCustomer = factory.createCustomer("Frequent");
        Customer newCustomer = factory.createCustomer("New");
        Customer vipCustomer = factory.createCustomer("VIP");

        //Output customer specific emails to console
        System.out.println(businessCustomer.createEmail());
        System.out.println(returningCustomer.createEmail());
        System.out.println(frequentCustomer.createEmail());
        System.out.println(newCustomer.createEmail());
        System.out.println(vipCustomer.createEmail());


    }


}
