package p02_kings_gambit.abstractClasses;


import p02_kings_gambit.interfaces.Warrior;

public abstract class WarriorAbstract implements Warrior {
    private String name;

    public WarriorAbstract(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void handle() {
    }
}
