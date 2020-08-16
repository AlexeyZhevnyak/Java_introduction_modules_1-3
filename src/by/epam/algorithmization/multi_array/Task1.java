package by.epam.algorithmization.multi_array;

import java.util.Random;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task1 {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int[][] arr = new int[m][n];
        int length;

        Task1.init_arr(arr);
        Task1.print_source_matrix(arr);

        length = arr.length - 1;

        for (int j = 0; j < n; j++) {

            if (arr[0][j] > arr[length][j]){

                for (int i = 0; i < arr.length; i++) {

                    System.out.println(arr[i][j]);

                }
                System.out.println();
            }
        }

    }


    public static void init_arr(int[][] arr){

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = random.nextInt(20);

            }
        }
    }

    public static void init_arr(double[][] arr){

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = random.nextInt(15);

            }
        }
    }

    public static void print_source_matrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }
        System.out.println("----------");
    }



}
