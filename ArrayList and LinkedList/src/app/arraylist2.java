package app;

/**
 * arraylist2
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class arraylist2 {
    public static void main(String[] args) throws IOException {

        //How we take input
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //Create ArrayList
        ArrayList<String> myArr = new ArrayList<String>();
        
        //Add elements
        myArr.add("Italian Rivera");
        myArr.add("Jersey Shore");
        myArr.add("Puerto Rico");
        myArr.add("Los Cabos Corridor");
        myArr.add("Lumbin");
        myArr.add("Coney Island");
        myArr.add("Karlovy Vary");
        myArr.add("Bourbon-l'Archambault");
        myArr.add("Walt Disney World Resort");
        myArr.add("Barbados");

        System.out.println("Vacation Resort Advisor");
        System.out.println("Enter your name: ");
        String name = userInput.readLine();

        int nameLength = name.length();

        if(nameLength == 0) {
            System.out.println("Empty name entered!");
            return;
        }

        int vacationIndex = nameLength % myArr.size();

        System.out.println("\nYour name is " + name + ", its length is " 
        + nameLength + " characters,\n " + 
        "thats why we suggest you go to " 
        + myArr.get(vacationIndex));

    }
    
}