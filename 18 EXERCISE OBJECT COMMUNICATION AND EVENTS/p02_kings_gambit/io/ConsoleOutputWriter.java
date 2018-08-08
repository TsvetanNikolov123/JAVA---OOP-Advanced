package p02_kings_gambit.io;

import p02_kings_gambit.interfaces.OutputWriter;

public class ConsoleOutputWriter implements OutputWriter{
    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }

    @Override
    public void writeLine(String format, Object... params) {
        System.out.println(String.format(format, params));
    }
}
