package ie.atu;

import java.util.Scanner;
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }
    //Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Method to take user input
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter Age: ");
        this.age = scanner.nextInt();
    }

    //Method to display info
    public void displayInfo(){
        System.out.println("----Details----");
        System.out.println("Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("---------------");
    }

    //Getter & Setter method for user Input fields
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
