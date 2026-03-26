package sve2.jee.logic;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import sve2.jee.dao.CustomerDao;
import sve2.jee.domain.Customer;


import java.util.List;

@RequestScoped
@Transactional
public class CustomerAdminBean implements CustomerAdmin {

    @Inject
    Logger logger;

    @Inject
    CustomerDao customerDao;

    @Override
    public boolean existsCustomer(Customer customer) {
        logger.info(String.format("existsCustomer(%s)", customer.getId()));
        return customerDao.customerExists(customer.getId());
    }

    @Override
    public Customer findCustomerById(long id) throws IdNotFoundException {
        logger.info(String.format("findCustomerById(%d)", id));
        return customerDao.findById(id).orElseThrow(
                () -> new IdNotFoundException("Customer", id)
        );
    }

    @Override
    public List<Customer> findAllCustomers() {
        logger.info("findAllCustomers()");
        return customerDao.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        logger.info(String.format("saveCustomer(%s)", customer));
        return customerDao.merge(customer);
    }
}
