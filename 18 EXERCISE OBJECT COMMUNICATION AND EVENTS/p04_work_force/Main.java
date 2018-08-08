package p04_work_force;


import p04_work_force.engine.Engine;
import p04_work_force.interfaces.InputReader;
import p04_work_force.interfaces.OutputWriter;
import p04_work_force.interpreters.CommandInterpreterImpl;
import p04_work_force.io.ConsoleInputReader;
import p04_work_force.io.ConsoleOutputWriter;
import p04_work_force.repositories.JobRepository;
import p04_work_force.repositories.Repository;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();
        Repository repository = new JobRepository();
        CommandInterpreterImpl interpreter = new CommandInterpreterImpl();
        Runnable engine = new Engine(reader, writer, repository, interpreter );
        engine.run();
    }
}
