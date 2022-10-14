# Last-digit-of-a-large-number


Define a function that takes in two non-negative integers aaa and bbb and returns the last decimal digit of aba^ba b. Note that aaa and bbb may be very large!





For example, the last decimal digit of 9^7 is 9, since 9^7=4782969  
 
 The last decimal digit of (2^200)2^300  which has over 10^92  decimal digits, is 6.

You may assume that the input will always be valid.





Examples
lastDigit(new BigInteger("4"), new BigInteger("1")) // returns 4
lastDigit(new BigInteger("4"), new BigInteger("2")) // returns 6
lastDigit(new BigInteger("9"), new BigInteger("7")) // returns 9
