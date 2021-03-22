import java.util.Scanner;

public class PrimeFactors {
   public static void main(String args[]){
      long number;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      number = sc.nextLong();
     
      for(long i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            
           // String primenumber = Long.toString(p);
            number = number/i;     
         }
         long p = i;
         long q = number;
         System.out.println("p:"+ p +"q:"+ q);
         
      }
      
      
    //   if(number >2) {
    //      System.out.println(number);
    //   }
      sc.close();
      



      
   }
}