package sve2.jee.util.annotation;

import jakarta.inject.Qualifier;

import java.lang.annotation.*;

@Qualifier
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    enum Type {
        SIMPLE,
        ADVANCED
    }

    Type value() default Type.SIMPLE;
}

