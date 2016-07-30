package Lesson3;

public class Main {
    public static void main(String[] args) {

        Archer ar = new Archer("Archer");
        Weapons weapon = new Weapons("Bow", "Bow....bow....bow!!!", 2, 1, 2, 3);
        Armors armor = new Armors("Clothes", "Clother Normal", 4, 4, 3, 1);
        ar.setEquipment(weapon, armor);
        System.out.println(ar.toString());
    }
}
