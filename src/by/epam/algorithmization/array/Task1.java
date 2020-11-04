//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
//

package by.epam.algorithmization.array;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int[] array = new int[n];
        int k = 2;
        int sum = 0;

        init_arr(array);
        print_source_arr(array);

        for (int value : array) {
            if (value % k == 0) {
                sum += value;
            }
        }

        System.out.println(sum);
    }

    public static void init_arr(int[] arr){

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(20);
        }

    }

    public static void init_arr(double[] arr){

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(20);
        }

    }

    public static void print_source_arr(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print_source_arr(double[] arr){

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
