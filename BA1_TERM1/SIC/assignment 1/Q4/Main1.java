import java.math.*;  
import java.util.*;  
import java.math.BigInteger; 
public class Main1 {
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        BigInteger a,b,m,exponent;  
        Scanner cin = new Scanner(System.in);  
          
        while(cin.hasNext()){ 
            
            m =cin.nextBigInteger();
            exponent =cin.nextBigInteger(); 

            BigInteger power = m.pow(exponent);
            b = cin.nextBigInteger();  
                  BigInteger result=a.mod(b);
         System.out.println(result);  
        }  
        cin.close();
       }  

    
}