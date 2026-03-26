package sve2.jee.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sve2.jee.domain.Customer;
import sve2.jee.logic.CustomerAdmin;

import java.util.List;

@Path("customers")
public class CustomerResource {

    @Inject
    CustomerAdmin customerAdmin;

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerAdmin.findAllCustomers();
        return customers;
    }



}
