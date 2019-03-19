package song1;

import java.util.Scanner;

public class duckSong {

    public static void main(String[] args) {
        duckSong singing = new duckSong();
        singing.song();
    }

    private void song() {
        Scanner songScanner = new Scanner(System.in);
        System.out.println("How many ducks?");
        int ducks = songScanner.nextInt();

        String word = "little ducks";

        for (int i = ducks; i > 0; i--) {

            if (i > 1) {

                System.out.println(i + " " + word + " went out one day");
                System.out.println("Over the hill and far away");
                System.out.println("Mother duck said \"Quack, quack, quack, quack.\"");
            }
            //If for one duck left and return of all five ducks
            if (i == 1) {
                word = "little duck";
                System.out.println(i + " " + word + " went out one day");
                System.out.println("Over the hill and far away");
                System.out.println("Mother duck said \"Quack, quack, quack, quack.\"");
                System.out.println("And all " + ducks + " little ducks came back.");
            } else {
                int newNum = i - 1;
                if(newNum == 1) {
                    word = "little duck";
                }
                System.out.println("But only " + newNum + " " + word + " came waddling back.\n");

            }
        }


    }
}


