# Bit-Manipulation
1. Swaping two Numbers: IN this we generally use temp variable to do this. But using BM XOR gate we can do this without using temp. 
- Even no. of 1s - 0
- odd no. of 1s - 1
2. ith bit is set or not: To do this one of the brutforce way is to convert the number into binary and then check the vaulue at the particular position. By optimizing this we can use the right shift operator (1 >> i) and then do the & of this value with number's binary if it is != 0. That means the ith bit is set.


