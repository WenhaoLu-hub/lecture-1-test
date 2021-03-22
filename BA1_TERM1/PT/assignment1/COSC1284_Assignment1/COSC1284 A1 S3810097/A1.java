import java.util.Scanner;
public class A1 {
    /*
    The number of the class:COSC1284
    Student Name: Wenhao Lu
    Studetn Number:S3810097
    Description: this main class will present a menu included two function:
    -Unit Converter
    -Lotto Checker
     */
    public void run() {  
        System.out.println("The program include two functions below");
        System.out.println("1.Unit Converter");
        System.out.println("2.Lotto"); 
        System.out.println("Please type a number of option: ");
        Scanner scanner = new Scanner(System.in);   //Creates an object of Scanner 
        int userInput = scanner.nextInt();
        if (userInput>2||userInput<0) {
            System.out.println("Invaid input,Please try again. 2 trys left");
            userInput = scanner.nextInt();           
        }
        if (userInput>2||userInput<0) {
            System.out.println("Invaid input,Please try again. 1 trys left");
            userInput = scanner.nextInt();           
        }
        if (userInput>2||userInput<0) {
            System.out.println("Sorry 3 incorrect inputs, the program will now terminate");
            System.exit(0);
        }
        if (userInput == 1) {
            System.out.println("--------Unit Converter--------\n"+
            "Celsius to Fahrenheit (0)\n"+
            "Kelvin to Fahrenheit (1)\n"+
            "Celsius to Kelvin (2)\n"+
            "SFahrenheit to Kelvin (3)\n"+
            "Fahrenheit to Celsius (4)\n"+
            "Kelvin to Celsius (5)\n"+
            "Please type the tool number,then press the ENTER:");
            int optionOfTool = scanner.nextInt();           //get user‘s input in order to choose which convertrr they want to use
            if (optionOfTool>5||optionOfTool<0) {           // Determine whether the user's input is correct
                System.out.println("Invaild Value");
                System.exit(0);                             // exit program
            }
            System.out.println("Enter the number you want to convert:");
            double convertNumber = scanner.nextDouble();
            double result = unitConverter(convertNumber, optionOfTool);
            System.out.printf("The Value returned from the converter is : %.1f\n",result);
            System.exit(0);                                  // exit program
        }else if (userInput == 2) {
            System.out.println("-------Lotto-------"); 
            System.out.println("Type 3 numbers, then press enter key:");
            int number1 = scanner.nextInt();                 // get 3 numbers
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            if ( number1 < 0 || number1 >48 || number2 < 0 || number2 >48 || number3 < 0 || number3 >48) { // Determine whether the user's input is correct
                System.out.println("The number is out of range.");
                System.exit(0);                               // exit program
            }

             int result[] = LootoCheck(number1,number2,number3); // store 8 random number in "result"
             System.out.println("\nThe numbers drawn were :" + result[0] + " "+ result[1] + " "+ result[2] + " "+
             result[3] + " "+ result[4] + " "+ result[5] + " "+ result[6] + " "+ result[7]); 
        }                        
        scanner.close();
        System.exit(0);  
    }
    /*
    Create a Unit Converter class
    */
    private double unitConverter(double convertNumber, int userOption) {
        double result = 0;                           // result of conversion
        if (userOption == 0) {
            System.out.println("You choose to cenvertCelsius to Fahrenheit");
            result = convertNumber * 9/5 + 32;       //Celsius to Fahrenheit
        }else if (userOption == 1) {
            System.out.println("You choose to Kelvin to Fahrenheit");
            result = convertNumber * 9/5 - 459.67;   //Kelvin to Fahrenheit
        }else if (userOption == 2) {
            System.out.println("You choose to Celsius to Kelvin");
            result = userOption + 273.15;            //Celsius to Kelvin
        }else if (userOption == 3) {
            System.out.println("You choose to Fahrenheit to Kelvin");
            result = (convertNumber + 459.67) * 5/9; //Fahrenheit to Kelvin
        }else if (userOption == 4) {
            System.out.println("You choose to Fahrenheit to Celsius");
            result = (convertNumber - 32) * 5/9;     //Fahrenheit to Celsius
        }else if (userOption == 4) {
            System.out.println("You choose to Kelvin to Celsius");
            result = convertNumber - 273.15;       //Kelvin to Celsius
        }
        return result;    
    }
    /*
    Create a Looto game class
    */
     private int[] LootoCheck(int number1 , int number2 , int number3){
        /*
        Generate random number
        */
        int randomNumber;
        int[] lottery = new int[8];
        randomNumber = (int) (Math.random() * 48 + 1);
        lottery[0] = randomNumber;
        randomNumber = (int) (Math.random() * 48 + 1);
        lottery[1] = randomNumber;
        randomNumber = (int) (Math.random() * 48 + 1);
        lottery[2] = randomNumber;
        randomNumber = (int) (Math.random() * 48 + 1);
        lottery[3] = randomNumber;
        randomNumber = (int) (Math.random() * 48 + 1);
        lottery[4] = randomNumber;
        randomNumber = (int) (Math.random() * 48 + 1);
        lottery[5] = randomNumber;
        randomNumber = (int) (Math.random() * 48 + 1);
        lottery[6] = randomNumber;
        randomNumber = (int) (Math.random() * 48 + 1);
        lottery[7] = randomNumber;
        /*
        Get match number
        */
        int num = 0; // how many correct number you get
        if (number1 == lottery[0]||number1 == lottery[1]||number1 == lottery[2]||number1 == lottery[3]||number1 == lottery[4]||number1 == lottery[5]||number1 == lottery[6]||number1 == lottery[7]) {
            num++;      
        }
        if (number2 == lottery[0]||number2 == lottery[1]||number2 == lottery[2]||number2 == lottery[3]||number2 == lottery[4]||number2 == lottery[5]||number2 == lottery[6]||number2 == lottery[7]) {
            num++;    
        }
        if (number3 == lottery[0]||number3 == lottery[1]||number3 == lottery[2]||number3 == lottery[3]||number3 == lottery[4]||number3 == lottery[5]||number3 == lottery[6]||number3 == lottery[7]) {
            num++;
        }     
        if (num!=0) {//
            System.out.println("The following "+num + " matches were found: ");
            //check correct number
            if (number1 == lottery[0]||number1 == lottery[1]||number1 == lottery[2]||number1 == lottery[3]||number1 == lottery[4]||number1 == lottery[5]||number1 == lottery[6]||number1 == lottery[7]) {
                System.out.print(number1 + " ");
            }
            if (number2 == lottery[0]||number2 == lottery[1]||number2 == lottery[2]||number2 == lottery[3]||number2 == lottery[4]||number2 == lottery[5]||number2 == lottery[6]||number2 == lottery[7]) {
                System.out.print(number2 + " ");
            }
            if (number3 == lottery[0]||number3 == lottery[1]||number3 == lottery[2]||number3 == lottery[3]||number3 == lottery[4]||number3 == lottery[5]||number3 == lottery[6]||number3 == lottery[7]) {
                System.out.print(number3 + " ");
            }
        }else{
            System.out.println("There is no match!");
            }
        return lottery;      
     }
    }


