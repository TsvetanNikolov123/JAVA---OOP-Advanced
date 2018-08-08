package p05_kings_gambit_extended.interfaces;

public interface OutputWriter {
    void writeLine(String output);

    void writeLine(String format, Object... params);
}
