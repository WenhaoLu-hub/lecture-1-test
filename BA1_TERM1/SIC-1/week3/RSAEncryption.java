import java.math.BigInteger;
import java.util.Scanner;


public class RSAEncryption {

	public static void main(String[] args) {
		  // Declare required parameters as BigInteger objects
	      BigInteger m;		// 	Input Message
	      BigInteger p;		//	1st prime number
	      BigInteger q;		//	2nd prime number
	      BigInteger n;		// 	Key parameter "n"
	      BigInteger phi_n;	//	Function Phi(n) 
	      BigInteger e;		//	Public Key parameter "e"
	      BigInteger d;		// 	Private Key parameter "d"
	      BigInteger C;		//	Encrypted Message
	      BigInteger M;  	//	Decrypted Message 
	      
	      // Take required parameter as Input
	      
	      Scanner input = new Scanner(System.in); // initialize Scanner object for taking input
	      
	      System.out.println("Welcome to RSA Encryption Program !!!");
	      System.out.println("Please provide the following information as Integer !!!");
	      System.out.print("Enter the message (as Integer) to encrypt, m := ");
	      String m_str = input.next();
	      
	      System.out.print("Enter the value of 'P' (as Integer): ");
	      String p_str = input.next();
	      
	      System.out.print("Enter the value of 'Q' (as Integer): ");
	      String q_str = input.next();
	      
	      System.out.print("Enter the value of 'e' (as Integer): ");
	      String e_str = input.next();

	      // assign values to bi1, bi2
	      m = new BigInteger(m_str);
	      p = new BigInteger(p_str);
	      q = new BigInteger(q_str);
	      
	      
	      System.out.println();
	      
	      System.out.println("Here is the detail Solution: ");
	      
	      n = p.multiply(q);
	      System.out.println("The value of 'n' is: "+n);
	      
	      
	      phi_n = p.subtract(new BigInteger("1")).multiply(q.subtract(new BigInteger("1")));
	      System.out.println("The value of 'Phi(n)' is: "+phi_n);
	      
	      e = new BigInteger(e_str);
	      
	      System.out.println("The Public-Key (n,e) := ("+n+", "+e+")");
	     	      
	      d = e.modInverse(phi_n);
	      System.out.println("The value of private key parameter 'd' is: "+d);
	      System.out.println("The Private-Key (n,d) := ("+n+", "+d+")");
	      
	      C = m.modPow(e, n);
	      
	      System.out.println("Ciphertext, C := "+C);
	      
	      M = C.modPow(d, n);
	      
	      System.out.println("Extracted Message, M := "+M);

	}

}
