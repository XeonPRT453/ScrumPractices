package edu.cdu.xeon.sprint3.s304935.task2.before;

public abstract class EnemyShip {

    private String name;
    private double speed;
    private double directionX;
    private double directionY;
    private double amtDamage;

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }

    public double getDamage() { return amtDamage; }
    public void setDamage(double newDamage) { amtDamage = newDamage; }

    public void followHeroShip(){

        System.out.println(getName() + " is following the hero");

    }

    public void displayEnemyShip(){

        System.out.println(getName() + " is on the screen");

    }

    public void enemyShipShoots() {

        System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");

    }

}