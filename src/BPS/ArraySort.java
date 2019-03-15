package BPS;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArraySort {
    public static void bubbleSort(int[] array, boolean asc) {
        int tmp;
        if(asc) {
            for (int i = 0; i < array.length; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] < array[j]) {
                        tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        bubbleSort(array, true);
    }

    public static void selectionSort(int[] array, boolean asc) {
        int tmp, index;
        if(asc) {
            for (int i = 0; i < array.length; i++) {
                index = i;
                tmp = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < tmp) {
                        index = j;
                        tmp = array[j];
                    }
                }
                array[index] = array[i];
                array[i] = tmp;
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                index = i;
                tmp = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > tmp) {
                        index = j;
                        tmp = array[j];
                    }
                }
                array[index] = array[i];
                array[i] = tmp;
            }
        }
    }

    public static void selectionSort(int[] array) {
        selectionSort(array, true);
    }

    public static void main(String[] args) {
        // Считывание размера массива
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        System.out.print("Сортировать по возрастанию? (true/false)");
        boolean asc = scanner.nextBoolean();
        // Заполнение массивов
        int[] sortByBubble = new int[size];
        final Random random = new Random();
        for(int i = 0; i < size; i++) {
            sortByBubble[i] = random.nextInt();
        }
        int[] sortBySelection = Arrays.copyOf(sortByBubble, size);
        int[] sortByArraysSort = Arrays.copyOf(sortByBubble, size);
        // Сортировка и замер времени работы
        long startTime = System.nanoTime();
        ArraySort.bubbleSort(sortByBubble, asc);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Bubble Method(asc=" + asc + "): " + (double)estimatedTime / 1_000_000_000.0);
        //System.out.println(Arrays.toString(sortByBubble));

        startTime = System.nanoTime();
        ArraySort.selectionSort(sortBySelection, asc);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Selection Method(asc=" + asc + "): " + (double)estimatedTime / 1_000_000_000.0);
        //System.out.println(Arrays.toString(sortBySelection));

        startTime = System.nanoTime();
        Arrays.sort(sortByArraysSort);
        if(!asc) {
            for (int left=0, right=sortByArraysSort.length-1; left<right; left++, right--) {
                int temp = sortByArraysSort[left];
                sortByArraysSort[left]  = sortByArraysSort[right];
                sortByArraysSort[right] = temp;
            }
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Arrays.sort()(asc=" + asc + "): " + (double)estimatedTime / 1_000_000_000.0);
        //System.out.println(Arrays.toString(sortByArraysSort));
    }
}
