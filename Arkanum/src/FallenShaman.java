public class FallenShaman extends Monster{

    public FallenShaman(String name) {
        super(name,3100,100,"Witcher");
    }

    void abrakadabra(Character target){
        target.health -= 10;
        target.power -= 12;
    }


    @Override
    void useSpell(Character target) {
        abrakadabra(target);
    }
}
