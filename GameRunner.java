/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/
import java.util.Scanner;  // Import the Scanner class

public class GameRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Game of Nim!");
    
    Scanner sc = new Scanner(System.in); // initialize scanner

    Game nim = new Game(); 
    
    while(true){
      Board.populate(); // static method call

      nim.play(); // start game

      System.out.println("Would you like to play again? (y/n)");

      // if y is pressed start a new game
      String input = sc.nextLine();
      if(!input.equals("y")){break;}
    }

    
  }
}