package sve2.jee.util;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.spi.InjectionPoint;
import jakarta.enterprise.inject.Produces;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class LoggerProducer {

    @Dependent
    @Produces
    public org.slf4j.Logger produceLogger(InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass());
    }
}
