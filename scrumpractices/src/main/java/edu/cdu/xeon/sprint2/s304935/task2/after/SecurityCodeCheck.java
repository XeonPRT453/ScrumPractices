package edu.cdu.xeon.sprint2.s304935.task2.after;

public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() { return securityCode; }

    public boolean isCodeCorrect(int secCodeToCheck){

        if(secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }
}
