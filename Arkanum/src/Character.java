public abstract class Character implements IDefendable,IAttackable{
    String name;
    int health;
    int power;
    String profession;

    public Character (String name, int health, int power, String profession){
        this.name = name;
        this.health = health;
        this.power = power;
        this.profession = profession;
    }

//    abstract void attack(Monster target);
//    abstract void defend(Character target);

    abstract void useAbility(Character target);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    boolean isAlive(){
        if (this.health > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public abstract void attack(Monster target);
}
