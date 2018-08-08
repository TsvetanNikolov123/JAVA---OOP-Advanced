package p06_mirror_image.commnads;

import p06_mirror_image.interfaces.Command;
import p06_mirror_image.interfaces.Wizard;

import java.util.Set;

public class FireballCommand implements Command {

    int wizardId;
    Set<Wizard> wizardLSet;


    public FireballCommand(int wizardId, Set<Wizard> wizardLSet) {
        this.wizardId = wizardId;
        this.wizardLSet = wizardLSet;
    }

    @Override
    public void execute() {
//        Wizard wizard = wizardLSet.
//        System.out.printf("%s %d casts Fireball for %d damage", wizard.getName(),
//                wizard.getId(), wizard.getMagicalPower());

//
//        System.out.printf("%s %d casts Fireball for %d damage%n", wizard.getName(),
//                wizard.getId(), wizard.getMagicalPower());

//
//        List<Wizard> wizardCastList = this.wizardList.stream()
//                .skip(this.wizardId).collect(Collectors.toList());
//
//        List<Wizard> wizardCastList1 = this.wizardList.subList(this.wizardId, this.wizardList.size()-1);
//
//        for (Wizard wizard1 : wizardCastList) {
//            System.out.printf("%s %d casts Fireball for %d damage%n", wizard1.getName(),
//                    wizard1.getId(), wizard1.getMagicalPower());
//        }



    }
}
