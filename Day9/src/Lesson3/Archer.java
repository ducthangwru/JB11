package Lesson3;

public class Archer extends Hero {
    public Archer() {
    }

    public Archer(String name) {
        this.name = name;
        strength = 1;
        dexterity = 5;
        intelligence = 1;
    }

    @Override
    public void setEquipment(Weapons weapon, Armors armor) {
        if (weapon == null) {
            this.attack = level;
        } else if (armor == null) {
            this.defense = level;
        } else {
            this.weapon = weapon;
            this.armor = armor;
            this.attack = this.level + weapon.level + weapon.getDexterityBonus();
            this.defense = this.level + armor.level + armor.getDexterityBonus();
        }
    }

    @Override
    public String tauntLine() {
        return "Aim twice,shoot once";
    }

    @Override
    public String toString() {
        return "Archer {" + super.toString();
    }
}