package games;

//imports collection of classes Random - use of streaming a psuedo random data to gain uncontrolled results
//import use of scanner that reads input from console (from user)
import java.util.Random;
import java.util.Scanner;

//creates class called "rock paper scissors"
public class rockPaperScissors {
    //New variables being assigned a type
    String playerName; //Any value within "" called playerName
    String playerMove; //Declaring undefined String type  variable called playerMove
    String computerMove; //Declaring undefined String type variable called computerMove
    int score; //whole number value only for score variable

    //main method is always needed
    public static void main(String[] args){
        rockPaperScissors rps = new rockPaperScissors(); //creates new instance called
        rps.initialiseGame();
    }

    private void initialiseGame(){
        System.out.println("Enter your name: ");
        Scanner playerName = myScanner.nextLine();
        playGame();
    }

    private void playGame(){
        System.out.println("Enter your move: ");
        playerMove = myScanner.nextLine();
        System.out.println(playerName + " has selected " + playerMove + " as their move");
        computerMove = generateComputerMove();
        String result = getWinner(playerMove, computerMove);
        if(result.equalsIgnoreCase("Win")){
            System.out.println("Congratulations, you won this round!");
            score++;
        }
        else if(result.equalsIgnoreCase("Lose")){
            System.out.println("You lost this round!");
            score--;
        }
        else {
            System.out.println("This round was a draw!");
        }

        if(score < 3 && score > -3){
            playGame();
        }
        else if(score == 3){
            System.out.println("Winner Winner!!");
        }
        else if(score == -3){
            System.out.println("You Looooooosssseeeee!");
        }

    }

    private String generateComputerMove() {
        Random r = new Random();
        String move = "";
        int i = r.nextInt(3);
        switch(i){
            case 0:
                move = "Rock";
                break;

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
                break;
        }
        return move;
    }

    private String getWinner(String playerMove, String computerMove){
        String outcome = "";
        if(playerMove.equalsIgnoreCase("rock")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Lose";
            }
            else{
                outcome = "Win";
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Draw";
            }
            else{
                outcome = "Lose";
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Win";
            }
            else{
                outcome = "Draw";
            }
        }
        return outcome;
    }
}
