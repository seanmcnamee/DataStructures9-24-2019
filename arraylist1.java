
import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String> ();

        obj.add("Bob");
        obj.add("Mary");
        obj.add("John");
        obj.add("Amy");
        obj.add("Steve");

        System.out.println("Current the array list ahs the following elements: " + obj);

        obj.add(4, "Ann");
        obj.add(1, "Tim");

        obj.remove("Mary");
        obj.remove("Amy");

        System.out.println("Current array list is: " + obj);
        obj.remove(1);

        System.out.println("Current array list is: " + obj);


        
    }
}