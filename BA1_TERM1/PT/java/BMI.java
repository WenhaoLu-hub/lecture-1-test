import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height:");     
        var height = scanner.nextDouble();
        System.out.println("Please enter your weight:");     
        var weight = scanner.nextDouble();
        var Bmi = weight/(height*height);
       // System.out.println(Bmi);
        System.out.printf("%s%.2f\n", "BMI:",Bmi);




    }
    Scanner.close();

    
}