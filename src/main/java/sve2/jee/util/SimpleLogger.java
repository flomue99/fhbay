package sve2.jee.util;

import jakarta.enterprise.context.Dependent;
import sve2.jee.util.annotation.Log;

@Log(Log.Type.SIMPLE)
@Dependent
public class SimpleLogger implements Logger {
    @Override
    public void info(String message) {
        System.out.println(message);
    }
}
