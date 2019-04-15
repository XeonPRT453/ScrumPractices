package edu.cdu.xeon.sprint3.s304935.task1;

import edu.cdu.xeon.sprint3.s304935.task1.before.Dog;
import edu.cdu.xeon.sprint3.s304935.task1.before.Animal;
import edu.cdu.xeon.sprint3.s304935.task1.before.Bird;

public class Task1App {

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        sparky.fly();
        tweety.fly();


    }
}
