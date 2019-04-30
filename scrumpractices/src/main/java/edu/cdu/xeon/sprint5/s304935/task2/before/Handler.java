package edu.cdu.xeon.sprint5.s304935.task2.before;

import java.util.Random;

public class Handler {
    private static final Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;

    public boolean execute(int num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println("   " + id + "-busy  ");
            return false;
        }
        System.out.println(id + "-handled-" + num);
        return true;
    }
}
