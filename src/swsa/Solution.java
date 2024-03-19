package swsa;

import java.util.ArrayList;
import java.util.Arrays;

/*
Сортировка пузырьком
*/

public class Solution {

    //    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));
    public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке: / Sorted numbers");
        print();
    }

    public static void sort() {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j-1] > numbers[j]) {
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }


    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
