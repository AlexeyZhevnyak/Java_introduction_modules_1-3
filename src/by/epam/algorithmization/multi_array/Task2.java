package by.epam.algorithmization.multi_array;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
public class Task2 {

    public static void main(String[] args) {

        int m = 4;
        int n = 4;
        int[][] arr = new int[m][n];

        Task1.init_arr(arr);
        Task1.print_source_matrix(arr);


        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i][i]);
        }

    }
}
