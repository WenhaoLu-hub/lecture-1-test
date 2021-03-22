import java.util.Scanner;

public class GameCharGen 
{
	public void displayMenu()
	{
		String menu = "*** WoK GameCharGen Menu***\n";
		String format = "%-25s%s%n";
		
		String wizard = String.format(format,"Create Wizard","WZ");
		String fighter = String.format(format,"Create Fighter","FG");
		String cleric = String.format(format,"Create Cleric","CL");
		String exit = String.format(format,"Exit Program","EX");
		System.out.println(menu + wizard + fighter + cleric + exit);

				
	}

	public void run() throws NoGameCharacterFoundException
	{
		GameCharGenModel myCharGen = new GameCharGenModel();
		Scanner menuInput = new Scanner(System.in);
		displayMenu();


			






		
		// Implement Q1 & Q4 menu updates here
		// Q2, Q3, & Q4 will be implemented in the GameCharGenModel class
		
	}
}
