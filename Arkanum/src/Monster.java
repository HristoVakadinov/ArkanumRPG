public abstract class Monster {
    String name;
    int health;
    int power;
    String type;

    public Monster(String name, int health, int power, String type) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.type = type;
    }

    void attack(Character target) {
        target.health -= this.power;

    }

    abstract void useSpell(Character target);

    boolean isAlive(){
        if (this.health > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
