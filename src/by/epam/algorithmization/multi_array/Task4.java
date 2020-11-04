package by.epam.algorithmization.multi_array;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1  2   3  ... n
n n-1 n-2 ... 1
1  2   3  ... n
n n-1 n-2 ... 1
...............
n n-1 n-2 ... 1
 */
public class Task4 {
    public static void main(String[] args) {

        int m = 4;
        int[][] arr = new int[m][m];

        int a = 4;
        int n;

        n = a;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr.length ; j++) {

                if ((i + 1) % 2 != 0){

                    arr[i][j] = j + 1;

                }else {

                    arr[i][j] = n--;

                }

            }
            n = a;
        }
        print_mult_array(arr);

    }

    public static void print_mult_array(int[][] arr){

        for (int[] ints : arr) {

            for (int j = 0; j < arr.length; j++) {

                System.out.print(ints[j] + "\t");
            }

            System.out.println();
        }
    }
}
