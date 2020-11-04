package by.epam.algorithmization.multi_array;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[][] arr = new int[m][n];

        int k = 1;
        int p = 2;

        Task1.init_arr(arr);
        Task1.print_source_matrix(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[k][i] + " ");

        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i][p]);

        }
    }
}
