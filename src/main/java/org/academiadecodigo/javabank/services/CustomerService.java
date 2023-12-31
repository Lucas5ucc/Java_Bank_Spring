package org.academiadecodigo.javabank.services;

import org.academiadecodigo.javabank.persistence.model.Customer;
import org.academiadecodigo.javabank.persistence.model.Recipient;

import java.util.List;

/**
 * Common interface for customer services, provides methods to manage customers
 */
public interface CustomerService {

    /**
     * Gets the customer with the given id
     *
     * @param id the customer id
     * @return the customer
     */
    Customer get(Integer id);

    /**
     * Gets the balance of the customer
     *
     * @param id the customer id
     * @return the balance of the customer with the given id
     */
    double getBalance(Integer id);

    /**
     * Saves a customer
     *
     * @param customer the customer to save
     * @return the saved customer
     */
    Customer save(Customer customer);

    /**
     * Deletes a customer
     *
     * @param id the customer id
     */
    void delete(Integer id);

    /**
     * Gets a list of the customers
     *
     * @return the customers list
     */
    List<Customer> list();

    /**
     * Gets the list of customer recipients
     *
     * @param id the customer id
     * @return the list of recipients of the customer
     */
    List<Recipient> listRecipients(Integer id);

    /**
     * Adds a recipient to the customer
     *
     * @param id        the customer id
     * @param recipient the recipient to add
     */
    void addRecipient(Integer id, Recipient recipient);

    /**
     * Removes a recipient from the customer
     *
     * @param id          the customer id
     * @param recipientId the recipient id
     */
    void removeRecipient(Integer id, Integer recipientId);
}
