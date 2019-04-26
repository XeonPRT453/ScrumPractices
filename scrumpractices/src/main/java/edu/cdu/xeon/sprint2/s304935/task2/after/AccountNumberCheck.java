package edu.cdu.xeon.sprint2.s304935.task2.after;

public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public int getAccountNumber() { return accountNumber; }

    public boolean accountActive(int acctNumToCheck){

        if(acctNumToCheck == getAccountNumber()) {

            return true;

        } else {

            return false;

        }

    }
}
