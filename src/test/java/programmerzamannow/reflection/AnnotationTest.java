package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;
import programmerzamannow.reflection.validation.Validator;

public class AnnotationTest {

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {

        Person person = new Person("Gilang","Maulana");
        Validator.validateNotBlank(person);
    }
}
