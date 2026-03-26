package sve2.jee.logic;

import java.io.Serializable;

public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException(String itemName, Serializable id) {
        super("%s with id <%s> not found".formatted(itemName, id));
    }
}
