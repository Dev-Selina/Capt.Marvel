package animals;

import java.util.Scanner;

public class createAnimal {
    //Not static so that it not always taking up memory
    Scanner myScanner = new Scanner(System.in);

    public static void main(String args[]) {

    }

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();
        if (animal.equalsIgnoreCase("dog")) {
            createDog();
        } else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        } else {
            System.out.println(animal + " is not an animal we can currently create, please try again");
        }
        //System.out.println("You've created a " + animal);
    }

    private void createCat() {

    }

    private void createDog() {

    }
}