public class Human extends Character implements IHealable{

    public Human(String name){
        super(name,1200,220,"Paladin");
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
    public void attack(Monster target) {
        target.health -= this.power;
    }

    @Override
    public void heal() {
        if (this.isAlive()) {
            if (1000 - this.health < 200) {
                this.health += 500;
            } else {
                this.health += 200;
            }
        }
    }

}
