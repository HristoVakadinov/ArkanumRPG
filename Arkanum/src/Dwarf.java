public class Dwarf extends Character {


    public Dwarf(String name) {
        super(name, 880, 200, "Necromancer");
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
        this.power += 12;
    }
}
