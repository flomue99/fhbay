package sve2.jee.logic;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import sve2.jee.domain.Customer;


import java.util.List;

@RequestScoped
@Transactional
public class CustomerAdminBean implements CustomerAdmin{

    @Inject
    Logger logger;

    @Override
    public boolean existsCustomer(String username) {
        logger.info(String.format("existsCustomer(%s)", username));
        return false;
    }

    @Override
    public Customer findCustomerById(long id) throws IdNotFoundException {
        logger.info(String.format("findCustomerById(%d)", id));
        return null;
    }

    @Override
    public List<Customer> findAllCustomers() {
        logger.info("findAllCustomers()");
        return List.of();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        logger.info(String.format("saveCustomer(%s)", customer));
        return null;
    }
}
