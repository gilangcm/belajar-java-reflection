package programmerzamannow.reflection.validation;

import programmerzamannow.reflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {
    public static void validateNotBlank(Object object) throws IllegalAccessException {

        // get class
        Class<?> aClass = object.getClass();

        // get all fields
        Field[] fields = aClass.getDeclaredFields();


        //iterate each fields
        for (Field field : fields) {
            field.setAccessible(true);
            //get not blank annotation
            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            // check if @notBlank is exist
            if (notBlank != null){

                //get field value
                String value = (String) field.get(object);

                if (notBlank.allowEmptyString()){
                    //allow empty string
                    // ignore
                }else {
                    //not allow empty string
                    value = value.trim();
                }
                // check if value is empty string
                if ("".equals(value)){
                    // throw error
                    throw new RuntimeException(field.getName() + " must not Blank");
                }
            }
        }
    }
}
