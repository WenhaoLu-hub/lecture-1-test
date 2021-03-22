import string
l = string.ascii_letters
s = []
s.append(l[34])
s.append(l[11])
s.append(l[14])
s.append(l[21])
s.append(l[4])
s.append(l[24])
s.append(l[14])
s.append(l[20])
s.insert(1, " ")
s.insert(6, " ")
string = "".join(s)
print(string)  // I love you
//# 73、76、79、86、69、85 对应的 ASCII
print(chr(73))    # I
print(chr(76))    # L
print(chr(79))    # O
print(chr(86))    # V
print(chr(69))    # E
print(chr(85))    # U