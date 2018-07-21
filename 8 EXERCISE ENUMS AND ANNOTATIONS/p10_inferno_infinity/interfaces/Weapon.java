package p10_inferno_infinity.interfaces;

import p10_inferno_infinity.enums.Gem;

public interface Weapon {

    void addGem(Gem gem, int index);

    void removeGem(int index);

    String getName();
}
