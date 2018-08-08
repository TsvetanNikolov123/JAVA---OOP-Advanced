package p02_kings_gambit;

import p02_kings_gambit.engine.Engine;
import p02_kings_gambit.interfaces.*;
import p02_kings_gambit.io.ConsoleOutputWriter;

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

