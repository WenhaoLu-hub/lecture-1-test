Assignment1
Student name: Wenhao Lu
Student number:S3810097
Class number:COSC1284


Program error:
-When program asks user to input the the number of tool
Scanner scanner = new Scanner(System.in);   //Creates an object of Scanner 
int userInput = scanner.nextInt();
If user type any letters or punctuation, it will  cause the program to crash 

Improvement


For some part of code, it looks like redundant and repeated because we can only use “if else” or “switch”, if we can use loop, it will make our code more efficient and shorter. 


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
