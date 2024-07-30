package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class CatDog {

    Method bark; //This is a Method Objects. It is not the method itself.
    //More like a representation of the method. We call invoke() to execute the represented method.
    Method meow;

    Field f;

    static Field[] fields = Dog.class.getDeclaredFields();

    public CatDog() {
        try {
            bark = Dog.class.getMethod("bark", null);
            meow = Cat.class.getMethod("meow", null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CatDog catDog = new CatDog();

        try {
            catDog.bark.invoke(null);
            catDog.meow.invoke(null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //Print all of Dog's Fields
        for(Field f : fields) {
            System.out.println(f.getName());
        }

        //Print all of CatDog's Fields
        for(Field f : CatDog.class.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        //Print all of String's Methods
        for(Method m : String.class.getMethods()) {
            System.out.println(m.getName());
        }


        for(Field f : fields) {
            if(Modifier.isPrivate(f.getModifiers())) {
                f.setAccessible(true);
            }
        }

        //Print all of Dog's Fields' values
        for(Field f : fields) {
            try {
                System.out.println(f.get(f.getName()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }

}