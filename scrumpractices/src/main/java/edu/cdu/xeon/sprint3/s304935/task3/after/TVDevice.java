package edu.cdu.xeon.sprint3.s304935.task3.after;

// Concrete Implementor

// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices

public class TVDevice extends EntertainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting){

        deviceState = newDeviceState;

        maxSetting = newMaxSetting;

    }

    public void buttonFivePressed() {

        System.out.println("Channel Down");

        deviceState--;

    }

    public void buttonSixPressed() {

        System.out.println("Channel Up");

        deviceState++;

    }

}