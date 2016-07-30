package Lesson3;

public class Armors extends Equipment{
    public Armors(){}
    public Armors(String name,String combatLine,int level,int strength,int dexterity,int intelligence){
        super(name,combatLine,level,strength,dexterity,intelligence);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}