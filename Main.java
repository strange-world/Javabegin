package copilot.javabegin;

//import java.io.*;
//Java program to illustrate methods

//Class name should be same as the file name, Main is the default class
class Main
{
    // Main method
    public static void main(String[] args)
    {
        // Creating an instance of the class
        Main obj = new Main();

        // Calling the method
        // using the object created
        obj.promptForName();
    }

    // Method inside the class
    void promptForName()
    {
        // Prompt the user
        System.out.println("Enter your name: ");
        String name = System.console().readLine();
        System.out.println("Hello " + name + "!");        
    }
}