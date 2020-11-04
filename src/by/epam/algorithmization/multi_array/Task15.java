package by.epam.algorithmization.multi_array;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
public class Task15 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[][] arr = new int[m][n];
        int maxi = 0;
        int maxj = 0;

        Task1.init_arr(arr);
        Task1.print_source_matrix(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > arr[maxi][maxj]) {

                    maxi = i;
                    maxj = j;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 != 0){

                    arr[i][j]  = arr[maxi][maxj];
                }
            }
        }

        Task4.print_mult_array(arr);

    }
}