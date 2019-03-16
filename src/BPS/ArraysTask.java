package BPS;

import java.util.Random;
import java.util.Arrays;

public class ArraysTask {
    public static void a() {
        int[] oddNums = new int[50];
        int index = 0;
        for(int i = 1; i < 100; i+=2) {
            oddNums[index] = i;
            index++;
        }
        System.out.println(Arrays.toString(oddNums));
        reverseArray(oddNums);
    }

    private static void reverseArray(int[] array) {
        System.out.print("[");
        for(int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[0] + "]");
    }

    public static void b() {
        int[] rndNums = new int[20];
        Random rnd = new Random();
        for(int i = 0; i < rndNums.length; i++)
            rndNums[i] = rnd.nextInt(11);
        System.out.println(Arrays.toString(rndNums));
        countOddEvenNums(rndNums);
    }

    private static void countOddEvenNums(int[] array) {
        int odd=0, even=0;
        for(int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) % 2 == 1)
                odd++;
            else
                even++;
        }
        System.out.println("odd = " + odd + ", even = " + even);
    }

    public static void c() {
        int[] rndNums = new int[10];
        Random rnd = new Random();
        for(int i = 0; i < rndNums.length; i++)
            rndNums[i] = rnd.nextInt(100) + 1;
        System.out.println(Arrays.toString(rndNums));
        for(int i = 1; i < rndNums.length; i+=2)
            rndNums[i] = 0;
        System.out.println(Arrays.toString(rndNums));
    }

    public static void d() {
        int[] rndNums = new int[15];
        int min = 51, max = -51;
        int minIndex = -1, maxIndex = -1;
        Random rnd = new Random();
        for(int i = 0; i < rndNums.length; i++)
            rndNums[i] = rnd.nextInt(101) - 50;
        for(int i = 0; i < rndNums.length; i++) {
            if (rndNums[i] <= min) {
                min = rndNums[i];
                minIndex = i;
            }
        }
        for(int i = 0; i < rndNums.length; i++) {
            if (rndNums[i] >= max) {
                max = rndNums[i];
                maxIndex = i;
            }
        }
        System.out.println("MIN: Array[" + minIndex + "] = " + min);
        System.out.println("MAX: Array[" + maxIndex + "] = " + max);
    }

    public static void e() {
        int[] rndNums1 = new int[10];
        int[] rndNums2 = new int[10];
        double avg1=0, avg2=0;
        Random rnd = new Random();
        for(int i = 0; i < rndNums1.length; i++)
        {
            rndNums1[i] = rnd.nextInt(11);
            rndNums2[i] = rnd.nextInt(11);
        }
        for(int i = 0; i < rndNums1.length; i++) {
            avg1 += rndNums1[i];
            avg2 += rndNums2[i];
        }
        avg1 = (double)avg1 / rndNums1.length;
        avg2 = (double)avg2 / rndNums2.length;
        if(avg1 > avg2)
            System.out.println("avg1 > avg2");
        else if (avg1 < avg2)
            System.out.println("avg1 < avg2");
        else
            System.out.println("avg1 == avg2");
    }

    public static void f() {
        int[] rndNums = new int[20];
        int[] count = new int[3];
        int max = 0;
        Random rnd = new Random();
        for(int i = 0; i < rndNums.length; i++)
            rndNums[i] = rnd.nextInt(3) - 1;
        for(int i = 0; i < rndNums.length; i++)
            count[rndNums[i] + 1]++;
        for (int i = 0; i < count.length; i++)
            if (count[i] > max)
                max = count[i];
        for (int i = 0; i < count.length; i++)
            if (count[i] == max)
                System.out.print(i - 1 + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        a();
        System.out.println("--------------------------------------");
        b();
        System.out.println("--------------------------------------");
        c();
        System.out.println("--------------------------------------");
        d();
        System.out.println("--------------------------------------");
        e();
        System.out.println("--------------------------------------");
        f();
        System.out.println("--------------------------------------");
    }
}
