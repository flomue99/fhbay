package sve2.jee.util;

import jakarta.enterprise.context.Dependent;
import org.slf4j.LoggerFactory;
import sve2.jee.util.annotation.Log;

@Dependent
@Log(Log.Type.ADVANCED)
public class Slf4jLogger implements Logger{
    @Override
    public void info(String message) {
        LoggerFactory.getLogger(this.getClass()).info(message);
    }
}
