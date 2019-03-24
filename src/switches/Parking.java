package switches;

import java.util.Scanner;

public class Parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String args[]) {
        Parking p = new Parking();
        p.getInput();
    }
    private void getInput() {
        System.out.println("What day is it?");
        String day = myScanner.nextLine().toLowerCase(); //reads the next line entered into console and converts it all to lower case to match case statements
        System.out.println("How long will you be staying?");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What position do you hold within the college?(Staff/Student/Visitor)");
        String position = myScanner.nextLine().toUpperCase();
        calculateFees(day, duration, position);
    }

    private void calculateFees(String day, int duration, String position) {
        int cost;
        int hourlyRate = 0;
        int multiplier = 0;

        switch (position) {
            case "STAFF":
                multiplier = 2;
                break;

            case "STUDENT":
                multiplier = 1;
                break;

            case "VISITOR":
                multiplier = 3;
                break;
            default:
                System.out.println("Failed to identify position. Please try again.");
                getInput();
        }
        switch(day){
            case "monday":
                hourlyRate = 2;
                break;
            case "tuesday":
                hourlyRate = 2;
                break;
            case "wednesday":
                hourlyRate = 3;
                break;
            case "thursday":
                hourlyRate = 2;
                break;
            case "friday":
                hourlyRate = 3;
                break;
            case "saturday":
                hourlyRate = 4;
                break;
            case "sunday":
                hourlyRate = 5;
                break;
            default:
                System.out.println("Please try entering day again.");
                getInput();
        }
    cost = (hourlyRate * multiplier) * duration;
    System.out.println("Thanks for parking at Gateshead College, please pay £" + cost);
    }
}


