package p05_kings_gambit_extended.commands;

import p05_kings_gambit_extended.interfaces.Executable;
import p05_kings_gambit_extended.interfaces.GuardsGroup;

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
