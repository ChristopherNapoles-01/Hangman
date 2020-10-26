package hang;
import java.util.Scanner;
import java.util.Random;
public class HangMan {
	public String [] words = {"best","beast","shade","shark","vets","harpy"};
	Random rand = new Random();
	public int lim = words.length;
	public int num = rand.nextInt(lim);
	public String genWord=words[num];
	public int count=0,chances=10;
	public String replaceWord = genWord;
	public String holder = replaceWord;
	public String end;
	boolean c=true;
	public Scanner scan = new Scanner(System.in);
	
	public void printMenu()
	{
		System.out.println("----------------");
		System.out.println(" Hangman Game! ");
		System.out.println("----------------");
		System.out.println("\n");
		System.out.println("type guess to play the game");
		System.out.println("type quit to quit the game:");
	}
	public void gameGuess(String command)
	{
		char guess;
		
		int i;
		for (i=0;i<replaceWord.length();i++)
		{
			char ast = '*';
			replaceWord=replaceWord.replace(replaceWord.charAt(i), ast);
			
		}
		while (c)
		{
			System.out.println("Enter your Guess:");
			guess = scan.nextLine().charAt(0);
			count++;
			chances--;
			
			if(genWord.indexOf(guess)!=-1)
			{
				hangmanImage(count);
				System.out.println("The letter is in the word!");
				System.out.println(printStatus(guess));
			}	
			else
			{
				hangmanImage(count);
				System.out.println("Wrong!The Letter is not in the word");
				
				
			}
			System.out.println(chances+" chances left");
			if (chances==0)
			{
				System.out.println("\tImage");
				System.out.println(" |__________________|");
				System.out.println(" |               [ ]");
				System.out.println(" |                |");
				System.out.println(" |               ( )");
				System.out.println(" |               _|_");
				System.out.println(" |              | | |");
				System.out.println(" |              | | |");
				System.out.println(" |                |");
				System.out.println(" |                |");
				System.out.println(" |               | |");
				System.out.println(" |               | |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |  _________________");
				System.out.println("[|]|                 |");
				System.out.println("===|  YOU KILLED ME! |");
				System.out.println("||||      NOOB!      |");
				System.out.println("===|_________________|");
				System.out.println("Game Over!,Thank You for Playing");
				break;
			}
			System.out.println(" ");
			
			
		}
		
	}
	public String printStatus(char guess)
	{
			char g=guess;
			
			int x = holder.indexOf(guess);
			
			StringBuilder jj = new StringBuilder(replaceWord);
			if(holder.charAt(x)==guess)
			{
				jj.setCharAt(x, g);
				
			}
			String gg = new String(jj);
			replaceWord = new String(gg);
			if(gg.equals(genWord))
			{
				System.out.println("You win!");
				System.out.println(" |__________________|");
				System.out.println(" |               [ ]");
				System.out.println(" |                |");
				System.out.println(" |                |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |               ( )");
				System.out.println(" |               _|_");
				System.out.println(" |              | | |");
				System.out.println(" |                |");
				System.out.println(" |               | |");
				System.out.println(" |  _____________|_|__");
				System.out.println("[|]|                 |");
				System.out.println("===|    THANK YOU!   |");
				System.out.println("||||    I'M SAVED!   |");
				System.out.println("===|_________________|");
				chances=10;
				c=false;
			}
			return "The Word:"+gg;
	}
	public void hangmanImage(int count)
	{
		System.out.println("\tImage");
		if(count==1)
		{
			System.out.println(" |__________________|");
		}
		else if(count==2)
		{
			System.out.println(" |__________________|");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");	
		}
		else if(count==3)
		{
			System.out.println(" |__________________|");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
		}
		else if(count==4)
		{
			System.out.println(" |__________________|");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("[|]");
		}
		else if (count==5)
		{
			System.out.println(" |__________________|");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("[|]");
			System.out.println("===");
			System.out.println("|||");
			System.out.println("===");
		}
		else if (count==6)
		{
			System.out.println(" |__________________|");
			System.out.println(" |               [ ]");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("[|]");
			System.out.println("===");
			System.out.println("|||");
			System.out.println("===");
		}
		else if (count==7)
		{
			System.out.println(" |__________________|");
			System.out.println(" |               [ ]");
			System.out.println(" |                |");
			System.out.println(" |               (_)");
			System.out.println(" | ");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("[|]");
			System.out.println("===");
			System.out.println("|||");
			System.out.println("===");
		}
		else if (count==8)
		{
			System.out.println(" |__________________|");
			System.out.println(" |               [ ]");
			System.out.println(" |                |");
			System.out.println(" |               (_)");
			System.out.println(" |               _|_");
			System.out.println(" |              / | |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("[|]");
			System.out.println("===");
			System.out.println("|||");
			System.out.println("===");
		}
		else if(count==9)
		{
			System.out.println(" |__________________|");
			System.out.println(" |               [ ]");
			System.out.println(" |                |");
			System.out.println(" |               (_)");
			System.out.println(" |               _|_");
			System.out.println(" |              | | |");
			System.out.println(" |              | | |");
			System.out.println(" |                |");
			System.out.println(" |                |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("[|]");
			System.out.println("===");
			System.out.println("|||");
			System.out.println("===");
		}
		
			
	}
	

}
