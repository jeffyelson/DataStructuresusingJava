/***********************************************
 You may use this comment section for your
 answers of part 2 of this assignment.

 fib1(5) ===> In fib1(5), since n>1 , it goes to the else part and calls fib1(5-1) + fib1(5-2) = fib1(4)+fib1(3)
 fib1(4) ==> [fib1(3)+fib1(2)] + fib1(3) ==> [fib1(2)+fib1(1)]
 fib1(3) ==> [fib1(2)+fib1(1)] + fib1(2) ==> [fib(1) + fib1(0)]  + fib1(2) ==> [fib1(1) + fib1(0)] + 1 (because n<=1 , it returns n)
 fib1(2) ==> [fib(1) + fib1(0)] + 1 + 1 + 0 +1 + 0 +1 ==> 1+0+4 = 5

 Tree recursion is a process where the function is recursively called and the function calls are branched out as nodes till it reaches the base value.
 ***********************************************/

import java.math.*;


public class BigIntegerFibonacci {


    public static BigInteger fib1(int n) {
        // TODO: Implementation
        BigInteger fib;
        if (n <= 1) {
            fib = BigInteger.valueOf(1);
            return fib;
        } else {
            BigInteger nminusone = fib1(n - 1);
            BigInteger nminustwo = fib1(n - 2);
            fib = nminusone.add(nminustwo);
            return fib;
        }

    }

    public static BigInteger fib2(int n) {
        // TODO: Implementation
        BigInteger first, second, fibtwo;
        first = new BigInteger("1");
        second = new BigInteger("1");
        fibtwo = first.add(second);

        for (int i = 0; i < n - 2; i++) {
            first = second;
            second = fibtwo;
            fibtwo = first.add(second);
        }
        return fibtwo;

    }

    public static void main(String[] args) {
        // TODO: Include test scenarios
        int n = 15;
        System.out.println(fib1(n));
        System.out.println(fib2(7));

        for (int j = 1; j <= 15; j++) {
            System.out.println(fib1(j));
        }
    }

}