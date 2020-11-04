package by.epam.algorithmization.multi_array;
// Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[][] arr = {{1, 2, 3},{5, 2, 6},{7, 8, -10}};


        Task1.print_source_matrix(arr);

        for (int i = 0; i < arr.length; i++) {

          if (arr[i][i] > 0) System.out.println(arr[i][i]);
        }


    }
}
