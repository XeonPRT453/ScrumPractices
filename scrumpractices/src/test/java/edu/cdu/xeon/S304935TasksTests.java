package edu.cdu.xeon;

import edu.cdu.xeon.sprint1.s304935.task2.after.Handler2;
import edu.cdu.xeon.sprint1.s304935.task2.before.Handler;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class S304935TasksTests {
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test(timeout=100)
    public void sprint1task2Before(){

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

    @Test(timeout=10)
    public void sprint1task2After(){

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
