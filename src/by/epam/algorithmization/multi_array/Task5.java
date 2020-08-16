package by.epam.algorithmization.multi_array;
/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
  1 1 1 ... 1 1 1
  2 2 2 ... 2 2 0
  3 3 3 ... 3 0 0
  ...............
  n-1 n-1 ..0 0 0
  n 0 0 ... 0 0 0
*/
public class Task5 {
    public static void main(String[] args) {
        int n = 6;
        int [][] arr = new int [n][n];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = i + 1;
            }

            n--;
        }

      Task4.print_mult_array(arr);
    }
}
