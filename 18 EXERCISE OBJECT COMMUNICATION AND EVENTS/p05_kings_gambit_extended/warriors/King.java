package p05_kings_gambit_extended.warriors;

import p05_kings_gambit_extended.abstractClasses.WarriorAbstract;

public class King extends WarriorAbstract {

    public King(String name) {
        super(name);
    }

    @Override
    public void handle() {
        System.out.printf("King %s is under attack!%n", super.getName());
    }
}
