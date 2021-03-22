import java.util.Scanner;

public class LeagueOfJustice // Pascal Case
{

    /**
     * Ask a user for three inputs
     * two numbers and a string.
     */
    public void run(){
        Scanner scanner = new Scanner(System.in);
        // String result = getAverageSpeedRounded(scanner);
        String result = "";
        // get the superheroes (two)
        //   create the list of superheroes
        // get the enter a speed for each superhero
        // logic to determine which one is the fastest.
        // Print someout.
        result = compareSpeed(scanner);
       
        System.out.println(result);
    }

    private String compareSpeed(Scanner scanner) {
        String result = "";
        System.out.println("Please select two superheroes from the list below:");
        System.out.println("(hit the enter key after each selection");

        String listOfHeroes = getListSuperheroes();
        System.out.println(listOfHeroes);

        int selection1 = Integer.parseInt(scanner.nextLine());
        int selection2 = Integer.parseInt(scanner.nextLine());

        String superhero1 = getSuperhero(selection1);
        String superhero2 = getSuperhero(selection2);

        if (isNumberPositive(selection1) && isNumberPositive(selection2)) 
        {
            double firstSpeed = getTotalOfSpeedSamples(superhero1, scanner);
            double secondSpeed = getTotalOfSpeedSamples(superhero2, scanner);
            
            result += "First speed is: " + firstSpeed + "\n";
            result += "Second speed is: " + secondSpeed + "\n";

            result += evaluateResponse(firstSpeed, secondSpeed, superhero1, superhero2);
            
        } else {
            result += "Invalid input please enter a number greater than zero";
        }
        return result;
    }

    private String evaluateResponse(double firstSpeed, double secondSpeed,
     String superhero1, String superhero2){
        String result = "";
        if (firstSpeed > secondSpeed) {
            result += superhero1 + " is faster than " + superhero2 + "\n";
        } else if (secondSpeed > firstSpeed && superhero1.equals("Superman")) {
            result += "Something is not right here, Superman is the fastest of them all." + "\n";
            result += superhero2 + " is faster than " + superhero1 + "\n";
        } else if (secondSpeed > firstSpeed) {
            result += superhero2 + " is faster than " + superhero1 + "\n";
        } else {
            result += "Both heroes have the same speed" + "\n";
        }
        return result;
    }

    private double getTotalOfSpeedSamples(String name, Scanner scanner){

            System.out.println("Please enter 5 speed values of " + name );
            System.out.println("(hit the enter key after each speed)");
            double speed = 0;
            for(int i =0; i < 5; i++){
                 speed += getSpeedFromUser(scanner);
            }
            return speed;
    }

    private boolean isNumberPositive(int number){
        if(number > 0){
            return true;
        }
        return false;
    }

    private String getListSuperheroes(){

        String result = "";
        final String FORMAT = "%-6s%s%n";

        result += String.format(FORMAT, "1.", getSuperhero(1));
        result += String.format(FORMAT, "2.", getSuperhero(2));
        result += String.format(FORMAT, "3.", getSuperhero(3));
        result += String.format(FORMAT, "4.", getSuperhero(4));
        result += String.format(FORMAT, "5.", getSuperhero(5));
        result += String.format(FORMAT, "6.", getSuperhero(6));

        return result;
    }


    private String getSuperhero(int selection){
        String result = "";
        final String SUPERMAN = "Superman";
        final String WONDERWOMAN = "Wonder Woman";
        final String GREEN_ARROW = "Green Arrow";
        final String AQUAMAN = "Aquaman";
        final String SUPERGIRL = "Supergirl";
        final String FLASH = "Flash";
        
        switch (selection) {
            case 1:
                result = SUPERMAN;
                break;
            case 2:
                result = WONDERWOMAN;
                break;
            case 3:
                result = GREEN_ARROW;
                break;
            case 4:
                result = AQUAMAN;
                break;
            case 5:
                result = SUPERGIRL;
                break;
            case 6:
                result = FLASH;
                break;
            default:
                result = SUPERMAN;
        }
        
        return result;
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
        // System.out.println("Please enter speed");
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

    private String getAverageSpeedRounded(Scanner scanner){
        String result = "";
       
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