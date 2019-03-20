package BPS;

import java.util.Random;
import java.util.Scanner;

public class ControlFlowStatements {
    public static void printByIfElse() {
        for (Planet p : Planet.values()) {
            if(p==Planet.MERCURY)
                System.out.println(Planet.MERCURY);
            else if(p==Planet.VENUS)
                System.out.println(Planet.VENUS);
            else if(p==Planet.EARTH)
                System.out.println(Planet.EARTH);
            else if(p==Planet.MARS)
                System.out.println(Planet.MARS);
            else if(p==Planet.JUPITER)
                System.out.println(Planet.JUPITER);
            else if(p==Planet.SATURN)
                System.out.println(Planet.SATURN);
            else if(p==Planet.URANUS)
                System.out.println(Planet.URANUS);
            else if(p==Planet.NEPTUNE)
                System.out.println(Planet.NEPTUNE);
        }
    }

    public static void printBySwitchCase() {
        for (Planet p : Planet.values()) {
            switch(p){
                case MERCURY:
                    System.out.println(Planet.MERCURY);
                    break;
                case VENUS:
                    System.out.println(Planet.VENUS);
                    break;
                case EARTH:
                    System.out.println(Planet.EARTH);
                    break;
                case MARS:
                    System.out.println(Planet.MARS);
                    break;
                case JUPITER:
                    System.out.println(Planet.JUPITER);
                    break;
                case SATURN:
                    System.out.println(Planet.SATURN);
                    break;
                case URANUS:
                    System.out.println(Planet.URANUS);
                    break;
                case NEPTUNE:
                    System.out.println(Planet.NEPTUNE);
                    break;
            }
        }
    }

    public static int[] countElemsInRndArray(int size, int minValue, int maxValue, int[] count) {
        int[] rndNums = new int[size];
        Random rnd = new Random();
        for(int i = 0; i < rndNums.length; i++)
            rndNums[i] = rnd.nextInt(maxValue - minValue + 1) + minValue;
        for(int i = 0; i < rndNums.length; i++) {
            count[rndNums[i] - minValue]++;
        }
        return count;
    }

    public static void printNumByIfElse(int[] count, int minValue) {
        for (int index = 0; index < count.length; index++) {
            if(index - minValue == 0)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 1)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 2)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 3)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 4)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 5)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 6)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 7)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 8)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 9)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
            else if(index - minValue == 10)
                System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
        }
    }

    public static void printNumBySwitchCase(int[] count, int minValue) {
        for (int index = 0; index < count.length; index++) {
            switch(index - minValue) {
                case 0:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 1:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 2:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 3:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 4:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 5:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 6:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 7:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 8:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 9:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
                case 10:
                    System.out.println("The number " + (index - minValue) + " enters the array " + count[index] + " times");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        long startTime, endTime;
        startTime = System.nanoTime();
        printByIfElse();
        endTime = System.nanoTime();
        System.out.println("printByIfElse():" + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        printBySwitchCase();
        endTime = System.nanoTime();
        System.out.println("printBySwitchCase():" + (endTime - startTime) + " ns");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите size: ");
        int size = in.nextInt();
        System.out.println("Значения в массиве генерируются случайно в пределах от minValue до maxValue");
        System.out.print("Введите minValue: ");
        int minValue = in.nextInt();
        System.out.print("Введите maxValue: ");
        int maxValue = in.nextInt();
        if(size <= 0)
            throw new IllegalArgumentException("size is negative or zero");
        if(maxValue < minValue)
            throw new IllegalArgumentException("maxValue can't be less than minValue");
        int[] count = new int[maxValue - minValue + 1];
        countElemsInRndArray(size, minValue, maxValue, count);

        startTime = System.nanoTime();
        printNumByIfElse(count, minValue);
        endTime = System.nanoTime();
        System.out.println("printNumByIfElse():" + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        printNumBySwitchCase(count, minValue);
        endTime = System.nanoTime();
        System.out.println("printNumBySwitchCase():" + (endTime - startTime) + " ns");
    }
}
