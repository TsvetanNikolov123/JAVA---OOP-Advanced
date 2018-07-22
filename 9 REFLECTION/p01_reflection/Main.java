package p01_reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class reflectionClass = Reflection.class;

        System.out.println("class " + reflectionClass.getSimpleName());
        System.out.println(reflectionClass.getSuperclass());
        Class[] interfaces = reflectionClass.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Reflection instance = (Reflection) reflectionClass.newInstance();
        System.out.println(instance);
    }
}
