package Lesson3;

public abstract class Hero {
    protected String name;
    protected Weapons weapon;
    protected Armors armor;
    protected int level, strength, dexterity, intelligence, attack, defense, hp = 100;

    public Hero() {
        armor = new Armors();
        weapon = new Weapons();
    }

    public abstract void setEquipment(Weapons weapon,Armors armor);


    public abstract String tauntLine();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", weapon(" + weapon +
                ", armor(" + armor +
                ", level=" + level +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                ", attack=" + attack +
                ", defense=" + defense +
                ", hp=" + hp +
                '}' +
                "\n Here'staunt line:" + tauntLine() +
                "\n Weapon's combat line:" + weapon.getCombatLine()+
                "\n Armor's combat line:" + armor.getCombatLine();
    }
}