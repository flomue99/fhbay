package sve2.jee.logic;

import sve2.jee.domain.Customer;

import java.util.List;

public interface CustomerAdmin {


    boolean existsCustomer(String username);

    Customer findCustomerById(long id) throws IdNotFoundException;

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
