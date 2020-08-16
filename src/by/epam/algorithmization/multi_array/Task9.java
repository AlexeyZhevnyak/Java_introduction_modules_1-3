package by.epam.algorithmization.multi_array;
// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

public class Task9 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[][] arr = new int[m][n];
        int[] sum = new int[m];
        int max = 0;

        Task1.init_arr(arr);
        Task1.print_source_matrix(arr);

        for (int j = 0; j < arr.length; j++) {

            for (int i = 0; i < arr.length; i++) {

                sum[j] += arr[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {

            System.out.print(sum[i] + " ");
        }


        for (int i = 0; i < sum.length; i++) {

            if (sum[i] > sum[max]) max = i;
        }

        System.out.println(max);

    }
}
