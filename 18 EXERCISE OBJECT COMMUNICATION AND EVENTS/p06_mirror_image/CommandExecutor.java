package p06_mirror_image;

import p06_mirror_image.interfaces.Command;
import p06_mirror_image.interfaces.Executor;

public class CommandExecutor implements Executor {
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
