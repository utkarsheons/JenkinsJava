package JavaCollectionsProgams.LinkedListPrograms.Queue;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class P5 {

    @Test
    public void queueProgram(){
        System.out.println(" ");
        System.out.println("###################### START P5 ######################");

        Queue<Integer> q = new LinkedList<>();

        //Enqueue operation --> adding elements into a queue
        q.add(7);
        q.add(78);
        q.add(56);
        q.add(3);
        q.add(45);
        q.add(56);
        System.out.println("Queue after enqueue is: " + q);

        //Dequeue operation --> removing elements from a queue
        q.poll();
        System.out.println("Queue after dequeue is: " + q);

    }


}
