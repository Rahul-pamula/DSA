import java.util.*;

public class Linkedlist_pract{

    public static void main(String[] args){
        LinkedList<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(9);
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.addFirst(0);
        System.out.println(linkedlist);

        linkedlist.removeLast();
        System.out.println(linkedlist);
        System.out.println(linkedlist.get(2));
    }
}