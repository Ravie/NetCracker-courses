package BPS;

import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author Ravie
 */
public class Factorial {
    public static int getNFromUser()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int index = in.nextInt();
        return index;
    }

    public static BigInteger FactorialCycle(long n)
    {
        BigInteger Factorial = BigInteger.valueOf(1);
        for (long i = n; i > 0; i--) {
            Factorial = Factorial.multiply(BigInteger.valueOf(i));
        }
        return Factorial;
    }

    public static BigInteger FactorialRecursion(long n)
    {
        if(n == 1)
            return BigInteger.valueOf(1);
        else
            return FactorialRecursion(n - 1).multiply(BigInteger.valueOf(n));
    }

    public static void main(String[] args) {
        int n = getNFromUser();
        BigInteger num;
        long startTime, estimatedTime;
        // Cycle
        startTime = System.nanoTime();
        num = FactorialCycle(n);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Цикл выполнялся " + (double)estimatedTime / 1_000_000.0 + " миллисекунд");
        System.out.println(n + "! = " + num.toString());
        // Recursion
        startTime = System.nanoTime();
        num = FactorialRecursion(n);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Рекурсия выполнялась " + (double)estimatedTime / 1_000_000.0 + " миллисекунд");
        System.out.println(n + "! = " + num.toString());
    }


}
