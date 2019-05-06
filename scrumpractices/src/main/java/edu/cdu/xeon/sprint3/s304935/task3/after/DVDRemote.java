package edu.cdu.xeon.sprint3.s304935.task3.after;

// Refined Abstraction

// If I decide I want to further extend the remote I can

public class DVDRemote extends RemoteButton{

    private boolean play = true;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        play = !play;

        System.out.println("DVD is Playing: " + play);

    }

}