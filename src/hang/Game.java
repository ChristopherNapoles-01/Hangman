package hang;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		while(true)
		{
			HangMan hangman = new HangMan();
			hangman.printMenu();
			String command = scan.nextLine();
			if(command.equals("quit"))
			{
				System.out.println("Thank you for Playing!");
				break;
			}
			else if(command.equals("guess"))
			{
				hangman.gameGuess(command);
			}
			else
			{
				System.out.println("Wrong Input!");
			}
			
		}

	}

}
