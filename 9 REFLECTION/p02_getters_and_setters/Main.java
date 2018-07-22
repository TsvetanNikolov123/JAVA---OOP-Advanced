package p02_getters_and_setters;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Class reflectionClass = Reflection.class;

        Method[] methods = reflectionClass.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                getters.add(method);
            } else if (method.getName().startsWith("set")) {
                setters.add(method);
            }
        }

        List<Method> sortedGetters = getters.stream()
                .sorted(Comparator.comparing(Method::getName))
                .collect(Collectors.toList());

        for (Method sortedGetter : sortedGetters) {
            System.out.println(sortedGetter.getName() + " will return " + sortedGetter.getReturnType());
        }

        List<Method> sortedSetters = setters.stream()
                .sorted(Comparator.comparing(Method::getName))
                .collect(Collectors.toList());

        for (Method sortedSetter : sortedSetters) {
            System.out.println(sortedSetter.getName() + " and will set field of " + sortedSetter.getParameterTypes()[0]);
        }
    }
}
