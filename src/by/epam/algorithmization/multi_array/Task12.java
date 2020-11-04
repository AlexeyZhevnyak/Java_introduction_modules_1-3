package by.epam.algorithmization.multi_array;
// Отсортировать строки матрицы по возрастанию и убыванию значений элементов
public class Task12 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[][] arr = new int[m][n];
        int buf;

        Task1.init_arr(arr);
        Task1.print_source_matrix(arr);

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length - 1; j++) {

                    for (int k = j + 1; k < arr[i].length; k++) {

                        if (arr[i][j] < arr[i][k]) {

                            buf = arr[i][j];
                            arr[i][j] = arr[i][k];
                            arr[i][k] = buf;
                        }
                    }
            }
        }

        System.out.println("Descending: ");
        Task4.print_mult_array(arr);


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length - 1; j++) {

                for (int k = j + 1; k < arr[i].length; k++) {

                    if (arr[i][j] > arr[i][k]) {

                        buf = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = buf;
                    }
                }
            }
        }

        System.out.println("Ascending: ");
        Task4.print_mult_array(arr);

    }
}
