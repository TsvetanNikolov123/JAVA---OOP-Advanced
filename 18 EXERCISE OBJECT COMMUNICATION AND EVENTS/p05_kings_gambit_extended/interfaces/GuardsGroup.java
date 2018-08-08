package p05_kings_gambit_extended.interfaces;

import java.util.List;

public interface GuardsGroup {
    List<Warrior> getGuards();

    void addMember(Warrior guard);

    void remove(String name);

    void groupAttack();
}
