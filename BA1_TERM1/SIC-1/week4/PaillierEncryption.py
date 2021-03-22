"""
# Author: Mohammad Saidur Rahman
"""
# Function Declarations

def egcd(a, b):				# Calculates Euclidian GCD,  return (g, x, y) ...  a*x + b*y = gcd(x, y)
    if a == 0:
        return (b, 0, 1)
    else:
        g, x, y = egcd(b % a, a)
        return (g, y - (b // a) * x, x)

def modinv(a, m):			# Calculates Inverse Mod
    g, x, y = egcd(a, m)
    if g != 1:
        raise Exception('modular inverse does not exist')
    else:
        return x % m


# define a function
def lcm(x, y):
   """This function takes two integers and returns the L.C.M."""

   # choose the greater number
   if x > y:
       greater = x
   else:
       greater = y

   while(True):
       if((greater % x == 0) and (greater % y == 0)):
           LCM = greater
           break
       greater += 1

   return LCM
# End of  Function Declarations

print("Welcome to Paillier Encryption Program !!!")
print("BOB generates Public and Private Key.")
	      
print("Please provide the following information as Integer !!!")
	      
	      
p_str = input("Enter the value of 'p' (as Integer): ")
p = int (p_str)

q_str = input("Enter the value of 'q' (as Integer): ")
q = int (q_str)

g_str = input("Enter the value of 'g' (as Integer): ")
g = int (g_str)
n = p * q
print("The value of 'n' is: "+str(n))
	      
print("The Public-Key (n,g) := ("+str(n)+", "+str(g)+") is sent to ALICE.")
print("BOB computes Private-Key parameters (Lambda, Meu) ")
	      
L = lcm((p-1),(q-1)) 

print("The value of 'Lambda' is: "+str(L))
	      
u = pow(g,L,n*n)

k = int ((u-1)/n)
	      
print("The value of k is := "+str(k))
	      
meu = int(modinv(k,n))


print("The value of 'Meu' is := "+str(meu))
	      
print("BOB's Private-Key (Lambda,Meu) := ("+str(L)+", "+str(meu)+")");
	      
print("ALICE Encrypts the Message, m ");

m_str = input("Enter the value of Message 'm' (as Integer): ")
m = int (m_str)
	      
r_str = input("Enter the value of 'r' (as Integer): ")
r = int (r_str)

C = int (((g**m)*(r**n)) % (n*n))
	      
print("Ciphertext, C := "+str(C));
print("BOB decrypts the Original Message.")

u1 = pow(C,L,n*n)

L_of_u1 = int ((u1-1)/n)

M = int ((L_of_u1 * meu ) % n)

print("Extracted Message, M := "+ str(M))

"""
######################  OUTPUT ##################

Welcome to Paillier Encryption Program !!!
BOB generates Public and Private Key.
Please provide the following information as Integer !!!
Enter the value of 'p' (as Integer): 5
Enter the value of 'q' (as Integer): 7
Enter the value of 'g' (as Integer): 164
The value of 'n' is: 35
The Public-Key (n,g) := (35, 164) is sent to ALICE.
BOB computes Private-Key parameters (Lambda, Meu)
The value of 'Lambda' is: 12
The value of k is := 32
The value of 'Meu' is := 23
BOB's Private-Key (Lambda,Meu) := (12, 23)
ALICE Encrypts the Message, m
Enter the value of Message 'm' (as Integer): 1
Enter the value of 'r' (as Integer): 17
Ciphertext, C := 127
BOB decrypts the Original Message.
Extracted Message, M := 1
"""