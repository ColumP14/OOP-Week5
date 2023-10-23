package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Create new person object
        Person user = new Person();

        //Get user input
        user.getUserInput();

        //Display user input from displayInfo method
        user.displayInfo();
    }
}