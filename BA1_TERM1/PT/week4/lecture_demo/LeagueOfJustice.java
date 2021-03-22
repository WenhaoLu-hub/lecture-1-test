import java.util.Scanner;

public class LeagueOfJustice // Pascal Case
{
    /**
     * Ask a user for three inputs
     * two numbers and a string.
     */
    public void run(){
        String result = getAverageSpeedRounded();
        System.out.println(result);
    }

    /*
	 * ALGORITHM 
	 * Begin 
	 * 		Step 1: Get data from the user 
	 * 				GET first speed 
	 * 				GET second speed 
	 * 				GET name of super hero 
	 * 		Step2:	Computation 
	 * 				ASSIGN numerator to the product of first speed and the second speed 
	 * 				ASSIGN numerator to the product of the numerator and 2 
	 * 				ASSIGN denominator to the sum of first speed and second speed 
	 * 				ASSIGN the result to the quotient of numerator and denominator PROCESS the result
	 * 		Step 3: Prepare display of data
	 * 				FORMAT average speed to 2 decimal places 
	 * 				CONCATENATE message + super hero name + average speed 
	 * End
	 */

    private double getSpeedFromUser(Scanner scanner){
        double result = 0.0;
        // Get user input
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed");
        result = Double.parseDouble(scanner.nextLine());
       
        return result;
    }

    private String getSuperheroName(Scanner scanner){
        String result = "";
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the superhero name");
        result = scanner.nextLine();
        return result;
    }

    private double computeAverageSpeed(double firstSpeed, double secondSpeed){
        
        final double NUMBER_OF_ITEMS = 2;
        double sumOfSpeeds = firstSpeed + secondSpeed;
        double average = Math.round(sumOfSpeeds / NUMBER_OF_ITEMS);

        return average;
    }

    private String getAverageSpeedRounded(){
        String result = "";
        Scanner scanner = new Scanner(System.in);
        // GET Speed from user
        double firstSpeed = getSpeedFromUser(scanner);
        double secondSpeed = getSpeedFromUser(scanner);
        String superheroName= getSuperheroName(scanner);

        double averageSpeed = computeAverageSpeed(firstSpeed, secondSpeed);
        result = processTheResults(superheroName, averageSpeed);
        scanner.close();
        return result;
    }

    private String processTheResults(String superheroName, double averageSpeed){
        String result = "";
        result = String.format("The average speed of " + superheroName 
        + " is: %10.2f kmph", averageSpeed);
        return result;
    }
}