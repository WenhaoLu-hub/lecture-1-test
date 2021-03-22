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
# End of  Function Declarations

print ("Welcome to ElGamal Encryption Program !!!")
print ("Please provide the following information as Integer.");

p_str = input("Enter the value of 'p' (as Integer): ")
p = int (p_str)

g_str = input("Enter the value of 'g' (as Integer): ")
g = int (g_str)

x_str = input("Enter the value of 'x' (as Integer): ")
x = int (x_str)

y = pow(g,x,p)

print ("The value of 'y' is: "+ str(y))

print ("The Private-Key x := "+str(x))
	      
print ("The Public-Key (p,y,g) := ("+str(p)+", "+str(y)+", "+str(g)+") is sent to ALICE.")
	      
print ("ALICE Encrypts the Message, m ")

m_str = input ("Enter the message (as Integer) to encrypt, m := ")

m = int (m_str)

r_str = input ("Enter the value of 'r' (as Integer): ")

r = int (r_str)

k = pow(y,r,p)

print ("The value of 'k' is: "+ str(k))

C1 = pow(g,r, p)

C2 = (m * k) % p

print("Ciphertexts, C1 := "+str(C1))
print("Ciphertexts, C2 := "+str(C2))
print("\n(C1, C2)=("+str(C1)+", "+str(C2)+") are sent to BOB.")
	      
print("BOB decrypts the Original Message.")
	      
k_bob = pow(C1,x, p)
	      
print("The value of 'k' @BOB is: "+str(k_bob))
	      
k_Inv = modinv(k,p)
	      
print("The value of 'k^-1' is: "+str(k_Inv));
	      
M = (k_Inv * C2) % p
print ("Extracted Message, M := "+str(M))

