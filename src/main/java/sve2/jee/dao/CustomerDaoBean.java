package sve2.jee.dao;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.enterprise.context.ApplicationScoped;
import sve2.jee.domain.Customer;

import java.util.List;
import java.util.Optional;


@ApplicationScoped
public class CustomerDaoBean implements CustomerDao {
    @PersistenceContext
    private EntityManager em;



    @Override
    public boolean customerExists(Long id) {
        return em.find(Customer.class, id) != null;
    }

    @Override
    public List<Customer> findAll() {
        return em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.ofNullable(em.find(Customer.class, id));
    }

    @Override
    public Customer merge(Customer entity) {
        return em.merge(entity);
    }

    @Override
    public void remove(Customer entity) {
        em.remove(entity);
    }

    @Override
    public void persist(Customer entity) {
        em.persist(entity);
    }
}
