package bank;

import java.util.Scanner;

public class HomeScreen {
    public byte accountOption;
    Scanner fromConsole = new Scanner(System.in);

    public static void main(String args[]) {
        //boolean q = false;
        //create new instance to show login requirements
        HomeScreen lg = new HomeScreen();
        lg.login();

//        if(q == true){
//            //function to logout whenever q is executed
//            //then go back to login method
//            System.exit;
//        }
    }
    //First screen to show login
    //Currently accepts any string login data then moves to account menu
    public void login() {
        String userID = "MacDaddy";
        String password = "IamaBOSS";
//        boolean q = false;
        //Need userID and password
        System.out.println("Welcome to Selina's Banking Solutions.\nPlease enter your userID:");
        String userTyped = fromConsole.nextLine();

        //Receive userID, now check if it matches.
        if (userTyped.equals(userID)){
            System.out.println("UserID: " + userID + "\nPassword:");
            String c = fromConsole.nextLine();
            //conditional statement to check whether the password matches
            if (c.equals(password)){
                getAccountInfo();
            }
            else{
                System.out.println("The Police are on their way.\nBetter put on your running shoes.\nJust kidding.\n Try again.");
                login();
            }
        }
        //when userID is incorrect
        else{
            System.out.println("INCORRECT!\nTry again.");
            login();
        }
    }

    public void getAccountInfo() {

        //display userID + account menu
        System.out.println("Please select an account option below to check the balance of:");
        System.out.println("   1. Current Account\n   2. Joint Account\n   3. Savings Account\n");
        byte accountOption = fromConsole.nextByte();
        //choosing to use case statements to choose which account info to display
        //case statement will select which class
        switch (accountOption){
            case 1:{
                System.out.println("Current Account");
            }
            case 2:{
                System.out.println("Joint Account");
            }
            case 3:{
                System.out.println("Savings Account");
            }
            default:{
                System.out.println("Account selection invalid, please choose enter an option number.\n");
            }
        }
    }
}

