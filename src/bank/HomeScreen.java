package bank;

import java.util.Scanner;

public class HomeScreen {
    public byte accountOption;
    //atm hard-stored values to focus on creating a whole system, before increasing complexity.
    String userID = "f";//"Captain Marvel";
    String password = "d"; //"IamaBOSS";

    Scanner fromConsole = new Scanner(System.in);

    public static void main(String args[]) {
        //creates new instance object/variable from HomeScreen class
        HomeScreen lg = new HomeScreen();
        lg.loginPage(); //Appends, inserts? loginPage() method i.e. first-leading method
    }

    private void loginPage() {

        //Print to console welcome message and request for userID
        System.out.println("Welcome to Selina's Banking Solutions.\nPlease enter your userID:");
        String userTyped = fromConsole.nextLine(); //creating userTyped (and assigning String data type) to temp store the input user has typed into console

        //Receive userID, now check if it matches what has been stored "Captain Marvel".
        if (userTyped.equals(userID)) { //.equals compares two strings, the userTyped and userID
            System.out.println("UserID: " + userID + "\nPassword:"); //prints to console if the condition is met
        }
        //when userID is incorrect
        else {
            System.out.println("INCORRECT!\nTry again.\n");
            loginPage();
        }
        String c = fromConsole.nextLine();
        if (c.equals(password)) { //nested if(condition) to now validate the password is correct
            getAccountInfo(userID, password);   //go to getAccountInfo method
        } else {
            System.out.println("Agents of SHIELD are on their way!!!\nBetter pack up & ship out.\n");
            loginPage();
            //thinking about wrapping in if(passTries==3){lockedAccount();} private void lockedAccount(){sysoutprintln("Too many failed attempts to login. This account has now been locked.")}
        }
    }
//  getAccountInfo() displays available Current/Joint/Savings account for this user
    private void getAccountInfo(String userID, String password) {

        //display userID + account menu
        System.out.println(userID + "\nPlease select an account option below to check the balance of:");
        System.out.println("   1. Current Account\n   2. Joint Account\n   3. Savings Account\n   4. Logout");
        byte accountOption = fromConsole.nextByte();
        //Switch conditional logic to jump through each case statement to until it matches
        switch (accountOption) {
            case 1: {
                currentAccount();
                break;
            }
            case 2: {
//                jointAccount();
                break;
            }
            case 3: {
//                savingsAccount();
                break;
            }
            case 4: {
                loginPage();
                break;
            }
            //Must always include a default statement to handle when an option that does not match is entered
            default: {
                System.out.println("Account selection invalid.");
                getAccountInfo(userID, password);
            }
        }
    }

    public void currentAccount() {
        System.out.println(/*userID +*/ "'s Current Account\nBalance: £" /*+ cBalance*/);
        //List options

    }
/*      System.out.println("Current Account: £" + cBalance);
        System.out.println("Please select one of the options below.\n1. Withdraw\n2. Transfer\n3. Deposit\n4. Logout");
        byte accountOption = fromConsole.nextByte();
        //choosing to use case statements to choose which account info to display
        //switch to jump through case statement will select which class
        switch (accountOption) {
            case 1: {
                withdraw();
                break;
            }
            case 2: {
                transfer();
                break;
            }
            case 3: {
                deposit();
                break;
            }
            case 4: {
                loginPage();
                break;
            }
            default: {
                System.out.println("Account selection invalid.");
                getAccountInfo();
            }
        }
        public void jointAccount () {
            double cBalance = 2500.00;
            System.out.println("Joint Account: £" + cBalance);
            System.out.println("Please select one of the options below.\n1. Withdraw\n2. Transfer\n3. Deposit\n4. Logout");
            byte accountOption = fromConsole.nextByte();
            switch (accountOption) {
                case 1: {
                    withdraw();
                    break;
                }
                case 2: {
                    transfer();
                    break;
                }
                case 3: {
                    deposit();
                    break;
                }
                case 4: {
                    loginPage();
                    break;
                }
                default: {
                    System.out.println("Account selection invalid.");
                    getAccountInfo();
                }
            }
            public void savingsAccount () {
                double cBalance = 10000.00;
                System.out.println("Savings Account: £" + cBalance);
                System.out.println("Please select one of the options below.\n1. Withdraw\n2. Transfer\n3. Deposit\n4. Logout");
            }

            private void withdraw ( byte accType){
                if (accType.equals(cAccount)) {//choosing correct account type
                    if (wMonies <= cBalance) {//checking if withdrawal amount is available
                        System.out.println("\"userID + \"\nPlease confirm you want to withdraw: £ \"+ wMonies\" from \" + accType \" to \" + otherAccount\" ");
                    } else {
                        System.out.println("Insufficient funds.\nReturning to main menu.");
                        getAccountInfo();
                    }
                }
            }

            //validation - this method should first compare balance to withdraw input to see if enough monies available
            //then it performs math logic to decrease the balance by the entered amount
            boolean retVal;
            System.out.println("Withdraw: £");
            float w = fromConsole.nextFloat();
            String accountType;

            if (accountType.equals("jointAccount") {
                jointAccount();
            }
        }
        if (currentBalance >= w)){

        }
        //choose between current/joint/savings for balance
              else{
            System.out.println("Invalid amount.\nPlease try again.");
            withdraw();
        }
        System.out.println(accountType + " Account: £" + cBalance);
        byte accountOption = fromConsole.nextByte();
    }

    private void transfer() {
        //System.out.println(//need variable that stores the type of account name and another variable to that holds the balance of that account);
        System.out.println("How much would you like to transfer? £");
        //function to move monies between account balances
        userTyped = fromConsole.nextLine();
    }

*/    private void deposit() {
        //function to add entered money from console to "balance"
        System.out.println("How much would you like to deposit? £");
        double dMonies = fromConsole.nextDouble();
        Account toke = new Account();
        toke.balance = toke.balance + dMonies;

    }


}

