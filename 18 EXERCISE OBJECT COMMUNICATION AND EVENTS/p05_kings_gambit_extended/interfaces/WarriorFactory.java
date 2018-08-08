package p05_kings_gambit_extended.interfaces;

import java.lang.reflect.InvocationTargetException;

public interface WarriorFactory {
    Warrior createWarrior(String warriorType, String name) throws ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
