import java.util.Scanner;  // Import the Scanner class

public class Game {
    public void play(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int currentPlayer = 0;
        Player[] players = {new Player(), new Player()}; // initialize players

        // main game loop
        while(true){
            System.out.println(String.format("%s, its your turn!", players[currentPlayer].name));
            System.out.print(String.format("How many pieces would you like to take? (1-%s): ", (int)Board.getNumPieces()/2));

            Board.removePieces(sc.nextInt());

            // toggle between player 0 and 1
            if(currentPlayer == 0){currentPlayer = 1;}
            else{currentPlayer = 0;}
        }
    }
}
