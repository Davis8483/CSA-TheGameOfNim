import java.util.Scanner;  // Import the Scanner class
import java.util.Random; // Import the Random class

public class Game {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    Random rand = new Random(); // Create a Random object
    Player[] players = {new Player(), new Player()}; // initialize players

    public void play(){
        int currentPlayer = rand.nextInt(2); // the first player will be randomly selected

        // main game loop
        while(true){
            System.out.println(String.format("%s, its your turn!", players[currentPlayer].name));
            System.out.println(String.format("%s pieces remain...", Board.getNumPieces()));
            System.out.print(String.format("How many pieces would you like to take? (1-%s): ", (int)Board.getNumPieces()/2));

            while(!Board.removePieces(getIntegerInput())){
                System.out.print(String.format("Invalid Input, your input must be within range (1-%s): ", (int)Board.getNumPieces()/2));
            }

            // toggle between player 0 and 1
            if(currentPlayer == 0){currentPlayer = 1;}
            else{currentPlayer = 0;}

            // game has ended
            if(Board.getNumPieces() == 1){
                // announce who won
                System.out.println(String.format("%s won the game!", players[currentPlayer].name));

                players[currentPlayer].addWin(); // increase win counter

                // announce scores
                System.out.println(String.format("%s has %s wins, %s has %s wins.", players[0].name, players[0].getWins(), players[1].name, players[1].getWins()));
                break;
            }
        }
    }
    public int getIntegerInput(){
        try{
            return sc.nextInt();
        }
        catch(Exception e){
            sc.nextLine();
            return 0;
        }
    }
}
