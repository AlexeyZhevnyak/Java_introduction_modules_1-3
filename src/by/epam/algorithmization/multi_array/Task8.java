package by.epam.algorithmization.multi_array;
// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
// соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int transition;
        int m = 4;
        int n = 4;
        int[][] arr = new int[m][n];

        Task1.init_arr(arr);
        Task1.print_source_matrix(arr);

        int f1;
        int f2;

        Scanner scanner1 = new Scanner(System.in);
        f1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        f2 = scanner2.nextInt();


        for (int i = 0; i < arr.length; i++) {

            transition =arr[i][f1];
            arr[i][f1] = arr[i][f2];
            arr[i][f2] = transition;

        }

        Task4.print_mult_array(arr);

    }
}
