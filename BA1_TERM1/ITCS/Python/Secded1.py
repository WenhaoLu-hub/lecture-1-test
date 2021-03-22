def SECDED_correct(N, debug=0):
    # returns N if correct(ed), or 0xFFFF if uncorrectable
    mask = [0xFFFFFFFE, 0xAAAAAAA8,0xCCCCCCC8,0xF0F0F0E0,0xFF00FE00,0xfffe0000]
    pPos = [ 0, 1, 2, 4, 8, 16]
    pCalc = [0,0,0,0,0,0]
    pStored = [0,0,0,0,0,0]
    bittocorrect = 0
    for i in range(6) :
        pCalc[i] = (count1bits(N & mask[i]) & 31)
        pStored[i] = 1 \if (N & (1 << pPos[i])) > 0 else 0
        if (i > 0 and (1&pCalc[i]) != pStored[i]): # found an error
            bittocorrect += pPos[i]
        if (debug & 1):
        print(i, bittocorrect, pPos[i], pCalc[i], pStored[i])
    error_detected = (bittocorrect > 0)
    can_correct = (error_detected and (1 & pCalc[0] != pStored[0]))
    newN = N ^ (1 << bittocorrect) # Flip the erroneous bit
    if (debug & 2):
        print("N ",error_detected,can_correct,hex(N),hex(newN))
    if (error_detected):
        if (can_correct):
            return(newN) # bit position of error
        else:
            return (-1) # -1 is never a valid code
        else:
            return (N) # corrected or unchanged value


def count1bits(n): count = 0
while n:
n &= n-1
    count += 1
  return count