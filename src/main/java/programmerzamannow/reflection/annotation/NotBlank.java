package programmerzamannow.reflection.annotation;

import java.lang.annotation.*;

@Target({
        ElementType.FIELD
})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {
    boolean allowEmptyString() default false;
}
