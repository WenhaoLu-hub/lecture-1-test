import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entet the e:");
        long e = scanner.nextLong();
        System.out.print("Entet the P:");
        long p1 = scanner.nextLong();
        System.out.print("Entet the q:");
        long q = scanner.nextLong();     
        long lambdaN = (p1-1)*(q-1);
        System.out.println("lambdaN  is :"+lambdaN);
        long a = e , m =lambdaN ; 
        System.out.println("--------loading---------");
        System.out.println("d:"+modularInverse(a, m));
        System.out.print("please enter the encrypted message:");
        long encryptedMessage = scanner.nextLong();
        System.out.print("please enter the N:");
        long n = scanner.nextLong();
        System.out.println("--------loading---------");
        long x = encryptedMessage ; 
        long y = modularInverse(a, m); 
        System.out.println(y);
        long p = n; 
       // System.out.println("the orginal message is  " + message(x, y, p)); 
        scanner.close();
    }   
	static long modularInverse(long a, long m) 
    { 
        a = a % m; 
        for (long x = 1; x < m; x++) 
           if ((a * x) % m == 1) 
              return x; 
        return 1; 
    } 
    static long message(long x, long y, long p) 
	{ 
		long result = 1;	 
		x = x % p; 
	if (x == 0) return 0;
		while (y > 0) 
		{ 
			if((y & 1)==1) 
				result = (result * x) % p; 
			y = y >> 1; 
			x = (x * x) % p; 
		} 
		return result; 
	} 
}

