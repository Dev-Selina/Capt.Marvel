package animals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class createAnimal {
    //Not static so that it not always taking up memory
    Scanner myScanner = new Scanner(System.in);

    public static void main(String args[]) {

    }

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();
        if (animal.equalsIgnoreCase("Dog")) {
            createDog();
        } else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        } else {
            System.out.println(animal + " is not an animal we can currently create, please try again");
        }
        //System.out.println("You've created a " + animal);
    }

    private void createCat() {
        System.out.println("Please enter the following info.\n Cat breed:");
        String breed = myScanner.nextLine();


    }

    private void createDog() {
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = myScanner.nextInt();
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();
        Dog myDog = new Dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);
    }
}
