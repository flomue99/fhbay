package sve2.jee.dao;

import sve2.jee.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    boolean entityExists(Long id);

    List<Customer> findAll();

    Optional<Customer> findById(Long id);

    Customer merge(Customer entity);

    void remove(Customer entity);

    void persist(Customer entity);

}
