package sve2.jee.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;

@Path("")
@RequestScoped
public class HelloResource {

    @Inject
    Logger logger;
//    @GET
//    @Path("hello")
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getHelloMessage() {
//        return "Hello From SVE2 Group 2";
//    }

    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getHelloMessage() {
        logger.info("HelloResources.getHelloMessage() invoked");
        return Json.createObjectBuilder()
                .add("course", "SVE2")
                .add("message", Json.createArrayBuilder()
                        .add("Hello")
                        .add("From")
                        .add("SVE2 Group 2"))
                .build();
    }

    @PostConstruct
    void init() {
        logger.info("HelloResource initialized");
    }

    @PreDestroy
    void destroy() {
        logger.info("HelloResource destroyed");
    }
}
