package p11_inferno_infinity_toString.interfaces;

import p11_inferno_infinity_toString.enums.Gem;

public interface Weapon {

    void addGem(Gem gem, int index);

    void removeGem(int index);

    String getName();
}
