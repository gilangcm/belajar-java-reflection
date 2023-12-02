package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveTypeTest {

    @Test
    void testClass() {
        Class<Integer> integerClass = int.class;
        Class<Long> longClass = long.class;
        Class<Boolean> booleanClass = boolean.class;

        System.out.println(integerClass.isPrimitive());
        System.out.println(longClass.isPrimitive());
        System.out.println(booleanClass.isPrimitive());
    }

    @Test
    void testGetField() throws NoSuchFieldException {
        Class<Person> personClass = Person.class;

        Field age = personClass.getDeclaredField("age");

        System.out.println(age.getType().isPrimitive());
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        Field age = personClass.getDeclaredField("age");

        System.out.println(age.getType().isPrimitive());

        age.setAccessible(true);

        Person person = new Person("Gilang", "Maulana");
        person.setAge(30);

        System.out.println(age.getInt(person));
    }

    @Test
    void testInvokeMethod() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class<Person> personClass = Person.class;

        Method setAge = personClass.getDeclaredMethod("setAge", int.class);

        Person person = new Person("Gilang","Maulana");
        setAge.invoke(person,30);

        System.out.println(person);

    }
}
