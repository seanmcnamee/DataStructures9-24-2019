package app;

import java.util.LinkedList;
/**
 * linkedlist1
 */
public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        System.out.println("Linked list content: " + linkedList);

        linkedList.addFirst("FirstItem");
        linkedList.addLast("Last Item");

        System.out.println("Linked list content after addition: " + linkedList);

        Object firstvar = linkedList.get(0);
        System.out.println("First element: " + firstvar);
        linkedList.set(0, "Changed first item");
        Object firstvar2 = linkedList.get(0);

        System.out.println("First element after update by set method: " + firstvar2);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedList);

        linkedList.add(0, "Newly Added item");
        linkedList.remove(2);
        System.out.println("Final content: " + linkedList);

    }
    
}