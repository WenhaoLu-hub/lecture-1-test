//import java.lang.reflect.Array;
import java.util.Scanner;
// import java.util.concurrent.CountDownLatch;
// import java.util.Arrays;
// import java.util.Random;

public class Test {
    public static void main(String[] args) {
        /*
        get user input
        */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Type 3 numbers, then press enter ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if ( number1 < 0 || number1 >48 || number2 < 0 || number2 >48 || number3 < 0 || number3 >48) {
            System.out.println("The number is out of range.");          
        }
        //int[] userinput = {number1, number2, number3};             
        //System.out.println(Arrays.toString(userinput)); 
        //scanner.close();

        /*
        Generate random number
        */
        int[] lottery = new int[6];
        int randomNumber;
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
            if (lottery[0] == lottery[1]||lottery[2] == lottery[3]||lottery[3] == lottery[4]||lottery[4] == lottery[5]) {
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
            }
            if (lottery[0] == lottery[1]||lottery[2] == lottery[3]||lottery[3] == lottery[4]||lottery[4] == lottery[5]) {
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
            }      
        for (int i = 0; i < 6; i++) {
             // Random number created here.
            for (int x = 0; x < i; x++) {
                if (lottery[x] == randomNumber) // Here, code checks if same random number generated before.
                {
                    randomNumber = (int) (Math.random() * 48 + 1);// If random number is same, another number generated.
                    x = -1; // restart the loop
                }
            }
            lottery[i] = randomNumber;
        }
                        //String[] userOptionArr = userOption.split(" ");
                //System.out.println(userOptionArr);
                //String user1 = userOption.substring(userOption.length()-1);


        /*
        Get match number
        */
        int num = 0;
        if (number1 == lottery[0]||number1 == lottery[1]||number1 == lottery[2]||number1 == lottery[3]||number1 == lottery[4]||number1 == lottery[5]) {
            num++;      
        }
        if (number2 == lottery[0]||number2 == lottery[1]||number2 == lottery[2]||number2 == lottery[3]||number2 == lottery[4]||number2 == lottery[5]) {
            num++;    
        }
        if (number3 == lottery[0]||number3 == lottery[1]||number3 == lottery[2]||number3 == lottery[3]||number3 == lottery[4]||number3 == lottery[5]) {
            num++;
        }     
        if (num!=0) {
            System.out.print("The following "+num + " matches were found: ");
            if (number1 == lottery[0]||number1 == lottery[1]||number1 == lottery[2]||number1 == lottery[3]||number1 == lottery[4]||number1 == lottery[5]) {
                System.out.println(number1 + " ");
            }
            if (number2 == lottery[0]||number2 == lottery[1]||number2 == lottery[2]||number2 == lottery[3]||number2 == lottery[4]||number2 == lottery[5]) {
                System.out.println(number2 + " ");
            }
            if (number3 == lottery[0]||number3 == lottery[1]||number3 == lottery[2]||number3 == lottery[3]||number3 == lottery[4]||number3 == lottery[5]) {
                System.out.println(number3 + " ");
            }
        }else{
            System.out.println("There is no match!");
            }

        //     for (int i = 0; i < lottery.length; i++) {
        //         if (number1 == lottery[i]||number2 == lottery[i]||number3 == lottery[i]) {
        //             System.out.println(lottery[i] + " ");
        //         }           
        //     }
        // }else{
        //     System.out.println("There is no match!");
        // }
        System.out.println("The result is :"+ lottery[0] + " "+ lottery[1] + " "+ lottery[2] + " "+
                           lottery[3] + " "+ lottery[4] + " "+ lottery[5]);      
    }

}