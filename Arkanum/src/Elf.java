public class Elf extends Character implements IHealable{


    public Elf(String name) {
        super(name, 1000,310,"Amazon");
    }

    @Override
    public void attack(Monster target) {
        target.health -= this.power;
    }

    @Override
    public void defend(Character target) {
        this.health -= target.power;
    }

    @Override
    void useAbility(Character target) {
        this.heal();
    }
    @Override
    public void heal() {
        if (this.isAlive()) {
            if (800 - this.health < 200) {
                this.health += 300;
            } else {
                this.health += 100;
            }
        }
    }
}
