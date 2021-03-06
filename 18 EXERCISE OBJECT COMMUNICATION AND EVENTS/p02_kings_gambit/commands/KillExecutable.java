package p02_kings_gambit.commands;

import p02_kings_gambit.interfaces.Executable;
import p02_kings_gambit.interfaces.GuardsGroup;

public class KillExecutable implements Executable {

    private String warriorName;
    private GuardsGroup guardsGroup;

    public KillExecutable(String waririorName, GuardsGroup guardsGroup) {
        this.warriorName = waririorName;
        this.guardsGroup = guardsGroup;
    }

    @Override
    public void execute() {
        this.guardsGroup.remove(this.warriorName);
    }
}
