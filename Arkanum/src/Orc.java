public class Orc extends Character{


    public Orc(String name) {
        super(name,2000,370,"Barbarian");
    }

    @Override
    public void attack(Monster target) {
        target.health -= this.power;
    }

    @Override
    public void defend(Character target) {
        this.health -= target.power/2;
    }

    @Override
    void useAbility(Character target) {

    }
}
