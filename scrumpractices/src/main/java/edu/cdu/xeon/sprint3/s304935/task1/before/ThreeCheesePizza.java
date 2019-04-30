package edu.cdu.xeon.sprint3.s304935.task1.before;

public class ThreeCheesePizza implements Pizza{

    private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private double cost = 10.50;

    public void setDescription(String newDescription) {

        description = newDescription;

    }

    public String getDescription() {

        return description;

    }

    public void setCost(double newCost) {

        cost = newCost;

    }

    public double getCost() {

        return cost;

    }

    public String addMozzarella(){

        return getDescription() + ", mozzarella";

    }

    public String addTomatoSauce(){
        return getDescription() + ", TomatoSauce";
    }

}