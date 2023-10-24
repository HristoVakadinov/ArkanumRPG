public class BloodElf extends Character implements IHealable{
    public BloodElf(String name) {
        super(name, 1600, 333, "Witch");
    }

    @Override
    public void attack(Monster target) {
        target.health -= this.power;
    }

    @Override
    public void defend(Character target) {
        this.health -= (target.power-(this.health/2));
    }

    @Override
    void useAbility(Character target) {
        this.heal();
    }
    @Override
    public void heal() {
        if (this.isAlive()) {
            if (1100 - this.health < 200) {
                this.health += 444;
            } else {
                this.health += 220;
            }
        }
    }
}
