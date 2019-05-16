package edu.cdu.xeon.sprint5.s304935.task3.before;

public class ATMMachine {


    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine(){

    }



    public void setCashInMachine(int newCashInMachine){

        cashInMachine = newCashInMachine;

    }

    public void insertCard() {

        System.out.println("insert card");

    }

    public void ejectCard() {

        System.out.println("eject card");

    }

    public void requestCash(int cashToWithdraw) {

        System.out.println("request card");

    }

    public void insertPin(int pinEntered){

        System.out.println("insert pin");

    }


}
