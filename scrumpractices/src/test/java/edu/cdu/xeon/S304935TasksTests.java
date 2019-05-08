package edu.cdu.xeon;

import edu.cdu.xeon.sprint1.s304935.task1.after.*;
import edu.cdu.xeon.sprint1.s304935.task2.after.Handler2;
import edu.cdu.xeon.sprint1.s304935.task2.before.Handler;
import edu.cdu.xeon.sprint2.s304935.task1.after.EnemyAttacker;
import edu.cdu.xeon.sprint2.s304935.task1.after.EnemyRobot;
import edu.cdu.xeon.sprint2.s304935.task1.after.EnemyRobotAdapter;
import edu.cdu.xeon.sprint2.s304935.task1.after.EnemyTank;
import edu.cdu.xeon.sprint2.s304935.task2.after.BankAccountFacade;
import edu.cdu.xeon.sprint3.s304935.task1.after.Mozzarella;
import edu.cdu.xeon.sprint3.s304935.task1.after.Pizza;
import edu.cdu.xeon.sprint3.s304935.task1.after.PlainPizza;
import edu.cdu.xeon.sprint3.s304935.task1.after.TomatoSauce;
import edu.cdu.xeon.sprint3.s304935.task2.after.EnemyShip;
import edu.cdu.xeon.sprint3.s304935.task2.after.EnemyShipFactory;
import edu.cdu.xeon.sprint3.s304935.task2.before.UFOEnemyShip;
import edu.cdu.xeon.sprint3.s304935.task3.after.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class S304935TasksTests {
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test
    public void sprint1task1Test(){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());
        Assert.assertEquals(sparky.tryToFly(),"I can't fly");
        Assert.assertEquals(tweety.tryToFly(),"Flying High");
        // This allows dynamic changes for flyingType
        // It is a default class, so cannot call this class here

        //sparky.setFlyingAbility(new ItFlys());

        //System.out.println("Dog: " + sparky.tryToFly());

    }

    @Test(timeout=100)
    public void sprint1task2Before(){

        Handler[] nodes = {new Handler(), new Handler(),
                new Handler(), new Handler()};
        for (int i = 1, j; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            j = 0;
            while (!nodes[j].execute(i)) {
                j = (j + 1) % nodes.length;
            }

        }

    }

    @Test(timeout=10)
    public void sprint1task2After(){

        Handler2 rootChain = new Handler2();
        rootChain.add(new Handler2());
        rootChain.add(new Handler2());
        rootChain.add(new Handler2());
        rootChain.wrapAround(rootChain);
        for (int i = 1; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            rootChain.execute(i);

        }
    }

    @Test(timeout=10)
    public void sprint2task1After(){

        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();


    }

    @Test
    public void sprint2task2After(){

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(990.00);
    }

    @Test
    public void sprint3task1After(){

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());
    }

    @Test
    public void sprint3task2Before(){

        // Old way of creating objects
        // When we use new we are not being dynamic

        UFOEnemyShip ufoShip = new UFOEnemyShip();

        ufoShip.displayEnemyShip();

        ufoShip.followHeroShip();

        ufoShip.enemyShipShoots();




    }

    @Test
    public void sprint3task2After(){

        // Create the factory object
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        // Enemy ship object

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.print("What type of ship? (U / R / B)");

        if (userInput.hasNextLine()){

            String typeOfShip = userInput.nextLine();

            theEnemy = shipFactory.makeEnemyShip(typeOfShip);

            if(theEnemy != null){

                theEnemy.displayEnemyShip();

                theEnemy.followHeroShip();

                theEnemy.enemyShipShoots();

            } else System.out.print("Please enter U, R, or B next time");

        }


    }

    @Test
    public void sprint3task3After(){

        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));

        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));



        RemoteButton theDVD = new DVDRemote(new DVDDevice(1,14));

        // -----------------------

        System.out.println("Test TV with Mute");

        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("\nTest TV with Pause");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();



        System.out.println("\nTest DVD");

        theDVD.buttonFivePressed();
        theDVD.buttonSixPressed();
        theDVD.buttonNinePressed();
        theDVD.buttonNinePressed();
    }

}
