package edu.cdu.xeon.sprint3.s304935.task3.before;

public class TVDeviceWithMute extends EntertainmentDevice {

    public TVDeviceWithMute(int newDeviceState, int newMaxSetting){

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

    public void buttonNinePressed() {

        System.out.println("TV was Muted");

    }


}