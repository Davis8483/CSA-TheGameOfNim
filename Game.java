import java.util.Scanner;  // Import the Scanner class

public class Game {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object

    public void play(){
        int currentPlayer = 0;
        Player[] players = {new Player(), new Player()}; // initialize players

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

            if(Board.getNumPieces() == 1){
                System.out.println(String.format("%s won the game!", players[currentPlayer].name));
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
