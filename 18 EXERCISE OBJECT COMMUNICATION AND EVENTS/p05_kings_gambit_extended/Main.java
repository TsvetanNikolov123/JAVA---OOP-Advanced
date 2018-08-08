package p05_kings_gambit_extended;

import p05_kings_gambit_extended.engine.Engine;
import p05_kings_gambit_extended.interfaces.OutputWriter;
import p05_kings_gambit_extended.io.ConsoleOutputWriter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException,
            IOException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {

        //  InputReader reader = new ConsoleInputreader();
        OutputWriter writer = new ConsoleOutputWriter();
        // Repository repository = new HeroRepository();
        Runnable engine = new Engine(writer);
        engine.run();
    }
}

