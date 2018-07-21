package p11_inferno_infinity_toString.models;

import p11_inferno_infinity_toString.enums.Gem;
import p11_inferno_infinity_toString.enums.WeaponType;
import p11_inferno_infinity_toString.interfaces.Weapon;

public class WeaponImpl implements Weapon {

    private String name;
    private WeaponType type;
    private Gem[] sockets;

    public WeaponImpl(String name, WeaponType type) {
        this.setName(name);
        this.setType(type);
        this.sockets = new Gem[this.type.getMaxNumberOfSockets()];
    }

    private void setType(WeaponType weaponType) {
        this.type = weaponType;
    }

    @Override
    public void addGem(Gem gem, int index) {
        if (index >= 0 && index < this.sockets.length) {
            this.sockets[index] = gem;
        }
    }

    @Override
    public void removeGem(int index) {
        if (index >= 0 && index < this.sockets.length) {
            this.sockets[index] = null;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getMinDamage() {
        int minDamage = this.type.getMinDamage();
        for (int i = 0; i < getAllStrength(); i++) {
            minDamage += 2;
        }

        for (int i = 0; i < getAllAgility(); i++) {
            minDamage += 1;
        }

        return minDamage;
    }

    private int getMaxDamage() {
        int maxDamage = this.type.getMaxDamage();
        for (int i = 0; i < getAllStrength(); i++) {
            maxDamage += 3;
        }

        for (int i = 0; i < getAllAgility(); i++) {
            maxDamage += 4;
        }

        return maxDamage;
    }

    private int getAllStrength() {
        int strength = 0;
        for (Gem socket : sockets) {
            if (socket != null) {
                strength += socket.getStrength();
            }
        }

        return strength;
    }

    private int getAllAgility() {
        int agility = 0;
        for (Gem socket : sockets) {
            if (socket != null) {
                agility += socket.getAgility();
            }
        }

        return agility;
    }

    private int getVitality() {
        int vitality = 0;

        for (Gem socket : sockets) {
            if (socket != null) {
                vitality +=socket.getVitality();
            }
        }
        return vitality;
    }

    @Override
    public String toString() {
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
                this.getName(),
                this.getMinDamage(),
                this.getMaxDamage(),
                this.getAllStrength(),
                this.getAllAgility(),
                this.getVitality());

        //todo -00:13:03
    }
}
