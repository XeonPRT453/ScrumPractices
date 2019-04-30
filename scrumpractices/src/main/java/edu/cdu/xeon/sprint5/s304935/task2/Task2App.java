package edu.cdu.xeon.sprint5.s304935.task2;

import edu.cdu.xeon.sprint5.s304935.task2.before.Handler;

public class Task2App {
    public static void main(String[] args) {
        Handler[] nodes = {new Handler(), new Handler(),
                new Handler(), new Handler()};
        for (int i = 1, j; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            j = 0;
            while (!nodes[j].execute(i)) {
                j = (j + 1) % nodes.length;
            }
            System.out.println();
        }
    }
}
