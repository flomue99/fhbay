package sve2.jee.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
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

    @POST
    @Path("init")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response initCustomers() {
        List.of(
                new Customer("John", "Doe", "Test", "test", "test"),
                new Customer("Jane", "Smith", "Test", "test", "test"),
                new Customer("Alice", "Johnson", "Test", "test", "test")
        ).forEach(customerAdmin::saveCustomer);


        return Response.status(Response.Status.CREATED).build();
    }


}
