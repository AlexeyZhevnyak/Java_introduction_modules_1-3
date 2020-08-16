package by.epam.algorithmization.multi_array;

import java.util.Random;

// Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз
public class Task11 {
    public static void main(String[] args) {
            int count = 0;
            int[][] arr = new int[10][20];
            int[] five = new int[10];

            Task1.init_arr(arr);
            Task1.print_source_matrix(arr);

            Random random = new Random();

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length; j++) {

                    arr[i][j] = random.nextInt(15);

                    if (arr[i][j] == 5) five[i]++;
                }

            }

        Task4.print_mult_array(arr);

        for (int i = 0; i < five.length; i++) {

            if (five[i] >= 3){

                System.out.println(i);
            }
        }

    }
}
