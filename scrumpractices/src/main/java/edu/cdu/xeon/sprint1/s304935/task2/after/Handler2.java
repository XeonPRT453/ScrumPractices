package edu.cdu.xeon.sprint1.s304935.task2.after;

import java.util.Random;

public class Handler2 {
    private final static Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;
    private Handler2 nextInChain;

    public void add(Handler2 next) {
        if (nextInChain == null) {
            nextInChain = next;
        } else {
            nextInChain.add(next);
        }
    }

    public void wrapAround(Handler2 root) {
        if (nextInChain == null) {
            nextInChain = root;
        } else {
            nextInChain.wrapAround(root);
        }
    }

    public void execute(int num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println("   " + id + "-busy  ");
            nextInChain.execute(num);
        } else {
            System.out.println(id + "-handled-" + num);
        }
    }
}


