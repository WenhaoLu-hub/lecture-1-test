import java.util.Scanner;

public class Salary{
    public static double grossYearlySalary(double numberOfHoursPerWeek,
                                        double amountOfMoneyPerHour,
                                        double vocation) {
            double vocationtime =  vocation *8;                               
            double hoursPerYear = numberOfHoursPerWeek * 52.1419-vocationtime;
            double MoneyPerHour = amountOfMoneyPerHour;
            double total = hoursPerYear * MoneyPerHour;
            return total;
    }

    public static void main(String[] args) {
        Scanner gggggg = new Scanner(System.in);
        String input2 = gggggg.next();
        System.out.println(input2);
        String input3 = gggggg.next();
        System.out.println(input3);

        
        double result = grossYearlySalary(30, 50, 10);
        System.out.println(result);
        


        }
    
    
    
}