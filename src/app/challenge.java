package app;

import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * challenge: to add and remove data points based on user input for a linked list.
 */
public class challenge {

    public static void main(String[] args) throws IOException {
        
        //How we take input
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //Setup our linked list
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Red");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Pink");

        //Display contents
        System.out.println("Linked list content: " + linkedList);

        //Get user input
        String stop = "STOP";
        String userColor = "";
        while (!userColor.equals(stop)) {
            System.out.println("Enter a color ('STOP' to stop): ");
            userColor = userInput.readLine();

            if (userColor.equals(stop) || userColor.equals("")) {
                userColor = stop;
            }   else {
                linkedList.add(userColor);
            }
        }

        System.out.println("Linked list content: " + linkedList);

        System.out.println("Choose an (intger) index to delete: ");
        String strIndex = userInput.readLine();

        int index = Integer.parseInt(strIndex);
        System.out.println("Index: " + index);

        linkedList.remove(index);

        System.out.println("Linked list content: " + linkedList);
    }
}