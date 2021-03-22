import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int numberOfAttempts = 0;
        int trysleft = 0;        
        System.out.println("The program include two functions below");
        System.out.println("1.Unit Converter");
        System.out.println("2.Lotto");
        System.out.println("Please type a number of option: ");
        Scanner scanner = new Scanner(System.in);
        
        while (numberOfAttempts <3) {
            String userInput = scanner.next();
            numberOfAttempts = numberOfAttempts +1;
            trysleft = 3 - numberOfAttempts;
            if (userInput.equals("1")) {
                System.out.println("--------Unit Converter--------");
                System.out.println("Celsius to Fahrenheit (0)");
                System.out.println("Kelvin to Fahrenheit (1),");
                System.out.println("Celsius to Kelvin (2)");
                System.out.println("Fahrenheit to Kelvin (3)");
                System.out.println("Fahrenheit to Celsius (4)");
                System.out.println("Kelvin to Celsius (5)");
                System.out.println("Please type 2 numbers and then press the enter key.");
                String useroption = scanner.next();
                String user1 = useroption.substring(useroption.length()-1);
               // if (user1.equals(0){
                
                
               // }

                System.out.println(user1);

                break;     
            }else if (userInput.equals("2")) {
                System.out.println("-------Lotto-------");  
                break;
            } else{
                System.out.println("Invaid input,Please try again.(" + trysleft+ " trys left)");
        
    
    
            }
            

            
        }
        
        

        
    }
    
}