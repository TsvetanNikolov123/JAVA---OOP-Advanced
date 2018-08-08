package p02_kings_gambit.interfaces;

import java.util.List;

public interface GuardsGroup {
    List<Warrior> getGuards();

    void addMember(Warrior guard);

    void remove(String name);

    void groupAttack();
}
