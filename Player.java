import java.util.Scanner;  // Import the Scanner class

public class Player {
    String name;
    private int wins;

    Scanner sc = new Scanner(System.in);  // Create a Scanner object

    public Player(String name){
        this.name = name;
    }
    public Player(){
        System.out.print("Enter Player Name: ");
        this.name = sc.nextLine();
    }
    // increase number of wins by 1
    public void addWin(){
        this.wins += 1;
    }
    // accessor method for wins
    public int getWins(){
        return(this.wins);
    }
}
