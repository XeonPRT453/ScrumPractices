package edu.cdu.xeon.sprint4.s304935.task1.after;

import java.util.List;

public class TurnItAllOff implements Command {
    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    public void execute() {

        for (ElectronicDevice device : theDevices) {
            device.off();
        }

    }

    public void undo() {

        for (ElectronicDevice device : theDevices) {
            device.on();
        }

    }
}