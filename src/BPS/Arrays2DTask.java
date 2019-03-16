package BPS;

import java.util.Arrays;
import java.util.Random;

public class Arrays2DTask {
    public static void a() {
        int[][] array = new int[8][8];
        int sumMain = 0, sumSide = 0;
        long multMain = 1, multSide = 1;
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = rnd.nextInt(99) + 1;
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumMain += array[i][j];
                    multMain *= array[i][j];
                }
                if (i + j == array.length - 1) {
                    sumSide += array[i][j];
                    multSide *= array[i][j];
                }
            }
        printArray(array);
        System.out.println("MainDiag[sum="+sumMain+",mult="+multMain+"]");
        System.out.println("SideDiag[sum="+sumSide+",mult="+multSide+"]");
    }

    private static void printArray(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
    }

    public static void b() {
        int[][] array = new int[8][5];
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = rnd.nextInt(199) - 99;
        printArray(array);
        int max = maxElem(array);
        System.out.println("Max element: " + max);
        printIndexesOfNum(array, max);
    }

    private static int maxElem(int[][] array) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++)
                if(array[i][j] > max)
                    max = array[i][j];
        }
        return max;
    }

    private static void printIndexesOfNum(int[][] array, int num) {
        System.out.print("Element "+num+" was found on the following positions: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++)
                if(array[i][j] == num)
                    System.out.print("["+i+"]["+j+"], ");
        }
        System.out.println("\b\b");
    }

    public static void c() {
        int[][] array = new int[8][5];
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = rnd.nextInt(21) - 10;
        printArray(array);
        int row = rowWithMaxAbsMultiply(array);
        System.out.println("RowWithMaxAbsMultiply: " + row);
    }

    private static int rowWithMaxAbsMultiply(int[][] array) {
        int max = 0, absMult = 1, index = -1;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++)
                absMult *= Math.abs(array[i][j]);
            if(absMult > max) {
                max = absMult;
                index = i;
            }
            absMult = 1;
        }
        return index;
    }

    public static void d() {
        int[][] array = new int[10][7];
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = rnd.nextInt(101);
        System.out.println("Source array:");
        printArray(array);
        for(int i = 0; i < array.length; i++)
            Arrays.sort(array[i]);
        System.out.println("Back sorted by rows array:");
        printArrayVerticalFlip(array);
    }

    private static void printArrayVerticalFlip(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = array[i].length - 1; j >= 0; j--)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
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
    }
}
