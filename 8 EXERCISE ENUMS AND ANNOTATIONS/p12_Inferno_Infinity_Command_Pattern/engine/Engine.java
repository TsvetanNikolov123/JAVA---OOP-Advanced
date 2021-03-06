package p12_Inferno_Infinity_Command_Pattern.engine;

import p12_Inferno_Infinity_Command_Pattern.controller.WeaponsManager;
import p12_Inferno_Infinity_Command_Pattern.entities.enumerations.WeaponType;
import p12_Inferno_Infinity_Command_Pattern.entities.interfaces.Weapon;
import p12_Inferno_Infinity_Command_Pattern.repositories.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {
    private String[] params;
    private Repository<Weapon> weaponRepository;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private WeaponsManager weaponsManager;

    public Engine(Repository<Weapon> weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    public Engine(WeaponsManager weaponsManager) {
        this.weaponsManager = weaponsManager;
    }

    public void run() {
        while (true) {
            String[] tokens = new String[0];
            try {
                tokens = reader.readLine().split(";");
            } catch (IOException e) {
                e.printStackTrace();
            }
            if ("END".equalsIgnoreCase(tokens[0])) {
                break;
            }

            String command = tokens[0];

            switch (command) {
                case "Create":
                    WeaponType weaponType = WeaponType.valueOf(tokens[1]);
                    String name = tokens[2];
                    weaponsManager.createWeapon(name, weaponType);
                    break;
                case "Add":
                    String weaponName = tokens[1];
                    int socketIndex = Integer.parseInt(tokens[2]);
                    String gemType = tokens[3];
                    weaponsManager.addGem(weaponName, socketIndex, gemType);
                    break;
                case "Remove":
                    weaponName = tokens[1];
                    socketIndex = Integer.parseInt(tokens[2]);
                    weaponsManager.removeGem(weaponName, socketIndex);
                    break;
                case "Print":
                    weaponName = tokens[1];
                    weaponsManager.print(weaponName);
                    break;
                case "Compare":
                    String firstWeaponName = tokens[1];
                    String secondWeaponName = tokens[2];
                    weaponsManager.compare(firstWeaponName, secondWeaponName);
                    break;
                case "Author":
                    weaponsManager.getAuthor();
                    break;
                case "Revision":
                    weaponsManager.getRevision();
                    break;
                case "Description":
                    weaponsManager.getDescription();
                    break;
                case "Reviewers":
                    weaponsManager.getReviewers();
                    break;
            }
        }
    }
}
