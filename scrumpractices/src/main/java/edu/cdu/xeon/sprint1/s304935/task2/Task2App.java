package edu.cdu.xeon.sprint1.s304935.task2;


import edu.cdu.xeon.sprint1.s304935.task2.after.Handler2;
import edu.cdu.xeon.sprint1.s304935.task2.before.Handler;

public class Task2App {

    public static void main(String[] args) {
        before();
        after();

    }

    public static void before(){

        Handler[] nodes = {new Handler(), new Handler(),
                new Handler(), new Handler()};
        for (int i = 1, j; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            j = 0;
            while (!nodes[j].execute(i)) {
                j = (j + 1) % nodes.length;
            }

        }

    }

    public static void after(){

        Handler2 rootChain = new Handler2();
        rootChain.add(new Handler2());
        rootChain.add(new Handler2());
        rootChain.add(new Handler2());
        rootChain.wrapAround(rootChain);
        for (int i = 1; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            rootChain.execute(i);

        }
    }

}