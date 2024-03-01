import java.util.Scanner;  // Import the Scanner class

public class Player {
    String name;
    Scanner sc = new Scanner(System.in);  // Create a Scanner object

    public Player(String name){
        this.name = name;
    }
    public Player(){
        System.out.print("Enter Player Name: ");
        this.name = sc.nextLine();
    }
}
