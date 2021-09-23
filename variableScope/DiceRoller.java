package variableScope;

import java.util.Random;

public class DiceRoller {

    // * Comment declare des variables local qui ne sont vue que a l'interieur de la metod
    // * pour que une autres method les utilises il faut lui passe ne variables.
    
    // DiceRoller() {
    //     Random random = new Random();
    //     int number = 0;
    //     roll(random, number);
    // }

    // void roll(Random random, int number) {
    //     number = random.nextInt(6)+1;
    //     System.out.println(number);
    // }    

    /**
     * * Deuxieme methode est de declare les variables a l'exterieur de la method pour les rendre gobal
     * * elles peuvent etre utilise par tt les methods qui ce trouve dans la class.
     */

    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
