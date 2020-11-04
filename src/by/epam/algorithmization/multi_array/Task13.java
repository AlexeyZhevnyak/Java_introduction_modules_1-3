package by.epam.algorithmization.multi_array;
//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Task13 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[][] arr = new int[m][n];
        int buf;

        Task1.init_arr(arr);
        Task1.print_source_matrix(arr);

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < m - 1; i++) {

                for (int k = i + 1; k < n; k++) {

                    if (arr[i][j] < arr[k][j]) {

                        buf = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = buf;
                    }
                }
            }
        }

        System.out.println("Descending: ");
        Task4.print_mult_array(arr);


        for (int j = 0; j < n; j++) {

            for (int i = 0; i < m - 1; i++) {

                for (int k = i + 1; k < n; k++) {

                    if (arr[i][j] > arr[k][j]) {

                        buf = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = buf;
                    }
                }
            }
        }

        System.out.println("Ascending: ");
        Task4.print_mult_array(arr);


    }
}
