import java.util.Scanner;
import java.util.*;

public class RockPaperScissorsGame {
    
    public static void main(String[] args){
        // choices of Rock Paper Scissors
        // player choice and computer choice
        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice = "";
        boolean isPlayAgain = false;

        Scanner scan = new Scanner(System.in);
        do {
            // Ask player to input
            while(true){
                System.out.println("Pick a choice from Rock, Paper, or Scissors.");
                playerChoice = scan.next();

                if (playerChoice.equalsIgnoreCase("Rock") || playerChoice.equalsIgnoreCase("Paper") || playerChoice.equalsIgnoreCase("Scissors")){
                    break;
                }
                else{
                    System.out.println("Please enter \"Rock\", \"Paper\", or \"Scissors\".");
                }
            }

            // Let computer input
            Random rand = new Random();
            int compChoice = rand.nextInt(choices.length); // give me 0,1,2
            String computerChoice = choices[compChoice];
    
            System.out.println("Player chooses " + playerChoice.toUpperCase() + ".");
            System.out.println("Computer choice is " + computerChoice.toUpperCase() + ".");
    
            // Code section
            // Rules: Rock Beats Scissors, Paper beats Rock, Scissors beats Paper
            // There is a draw if both choice are the same
            if (playerChoice.equalsIgnoreCase(computerChoice)){
                System.out.println("The game is a tie.");
            }
            else if (playerChoice.equalsIgnoreCase("Rock")){
                if (computerChoice.equalsIgnoreCase("Paper")){
                    System.out.println("Computer WINS!");
                }
                else {
                    System.out.println("Player WINS!");
                }
            }
            else if (playerChoice.equalsIgnoreCase("Paper")){
                if (computerChoice.equalsIgnoreCase("Scissors")){
                    System.out.println("Computer WINS!");
                }
                else {
                    System.out.println("Player WINS!");
                }
            }
            else if (playerChoice.equalsIgnoreCase("Scissors")){
                if (computerChoice.equalsIgnoreCase("Rock")){
                    System.out.println("Computer WINS!");
                }
                else {
                    System.out.println("Player WINS!");
                }
            }
            else{
                System.out.println("Fine!");
            }
    
            // Ask if still want to play the game
            while(true){
                System.out.println("Do you still want to play the game? Yes, or No.");
                String yesOrNo = scan.next();
                
                if (yesOrNo.equalsIgnoreCase("Yes")){
                    isPlayAgain = true;
                    break;
                }
                else if (yesOrNo.equalsIgnoreCase("No")){
                    isPlayAgain = false;
                    break;
                }
                else{
                    System.out.println("Please enter \"Yes\" or \"No\".");
                }
            }
            
        }while(isPlayAgain);

        System.out.println("Goodbye!");
        scan.close();
    }
}
