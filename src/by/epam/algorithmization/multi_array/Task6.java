package by.epam.algorithmization.multi_array;
/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1 1 1 ... 1 1 1
 0 1 1 ... 1 1 0
 0 0 1 ... 1 0 0
 ...............
 0 1 1 ... 1 1 0
 1 1 1 ... 1 1 1
 */
public class Task6 {
    public static void main(String[] args) {
        int n = 8;
        int [][] arr = new int [n][n];
        int k = 0;
        int a;

        a = n;
        for (int i = 0; i < arr.length; i++) {

            if (i <= arr.length / 2){

                for (int j = i; j < a; j++) {

                    arr[i][j] = 1;
                }

                a--;

            }
        }

        a = n;

        for (int i = arr.length - 1; i > 0 ; i--) {

            for (int j = k; j < a; j++) {

                arr[i][j] = 1;
            }

            k++;
            a--;

        }

        Task4.print_mult_array(arr);
    }
}


