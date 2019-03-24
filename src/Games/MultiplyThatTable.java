package Games;

import java.util.Scanner;

public class MultiplyThatTable {
    Scanner myScanner = new Scanner(System.in);

    public static void main (String args[]){
        MultiplyThatTable mtt = new MultiplyThatTable();
        mtt.getValues();
    }
    private void getValues(){
        System.out.println("What number would you like the multiplication tables for?");
        //Integer.parseInt means only integer is allowed
        //(Scanner.nextLine()); this means the scanner input is being checked for integer only
        int number = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the maximum multiplication you want to calculate?");
        int multiplier = Integer.parseInt(myScanner.nextLine());
        calculate(number, multiplier);
    }
    private void calculate(int number, int multiplier){
        for (int i = 1; i <= multiplier; i++){
            System.out.println(i + " times " + number + " is " + i * number);
        }
    }
}
