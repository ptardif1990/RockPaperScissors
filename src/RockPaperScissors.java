import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Rock-Paper-Scissors game!");
		System.out.print("Please enter your player name:");
		String playerName = sc.nextLine();
		
		Player player1 = new Player(playerName);
		Player player2 = new ComputerPlayer();
		
		Game game = new Game(player1,player2);
		game.play(5);
		
		System.out.println("End of game!");
		
	}

}
