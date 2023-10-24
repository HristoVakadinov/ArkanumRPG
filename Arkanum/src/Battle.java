public class Battle {
    public static void main(String[] args) {

        int stage_ch = 0;
        int stage_m = 0;
        int counter = 1;

        Character Didi = new Human("Diana");
        Monster Pesho = new FallenShaman("Peter");

        System.out.println("Pesho's Health: " + Pesho.health + " // Pesho's Power: "+Pesho.power);
        System.out.println("Didi's Health : " + Didi.health + " // Didi's Power: "+Didi.power);

//        System.out.println(Didi.toString());
//        System.out.println(Pesho.toString());

        while  (Didi.isAlive()){
            System.out.println("---Stage: " + counter + "---");
            Didi.attack(Pesho);
            if (Pesho.isAlive()){
                System.out.println("You attacked monster and its health is: " + Pesho.health);
                Pesho.attack(Didi);
                stage_ch += 1;
                stage_m += 1;
                if(stage_m % 5 == 0){
                    if (Pesho.health <= 900) {
                        stage_m = 0;
                        Pesho.useSpell(Didi);
                        System.out.println("Pesho used abrakadabra and your power is: " + Didi.power);
                    }
                }
                if(!Didi.isAlive()){
                    System.out.println("The monster killed you! Game over! :(");
                    break;
                }
                else{
                    System.out.println("The monster attacked you and your health is: " + Didi.health);
                    counter += 1;
                    if(stage_ch == 3){
                        Didi.useAbility(Didi);
                        stage_ch = 0;
                        System.out.println("You have healed and your health is: " + Didi.health);
                    }
                }
            }
            else {
                System.out.println("The monster is dead! You won the battle!");
                break;
            }
        }


    }
}
