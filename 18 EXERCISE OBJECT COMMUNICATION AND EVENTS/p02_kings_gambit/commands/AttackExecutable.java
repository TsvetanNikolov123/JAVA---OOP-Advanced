package p02_kings_gambit.commands;

import p02_kings_gambit.interfaces.Executable;
import p02_kings_gambit.interfaces.GuardsGroup;

public class AttackExecutable implements Executable {

    private GuardsGroup guardsGroup;

    public AttackExecutable(GuardsGroup guardsGroup) {
        this.guardsGroup = guardsGroup;
    }

    @Override
    public void execute() {
        guardsGroup.groupAttack();
    }
}
