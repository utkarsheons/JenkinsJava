package JavaCollectionsProgams.LinkedListPrograms;

import org.junit.Test;

import java.util.LinkedList;

public class P4 {

    @Test
    public void numLinkedList(){
        System.out.println(" ");
        System.out.println("###################### START P4######################");

        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(5);
        numList.add(77);
        numList.add(32);
        numList.add(3);

        numList.addFirst(1);
        numList.addLast(89);

        System.out.println("Linked List is: " + numList);

    }

}
