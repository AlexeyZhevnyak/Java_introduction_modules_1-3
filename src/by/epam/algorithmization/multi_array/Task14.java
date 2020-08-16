package by.epam.algorithmization.multi_array;
// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
//         причем в каждом столбце число единиц равно номеру столбца.

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int count = 0;
        int[][] arr = new int [m][n];


        Random random = new Random();

        for (int j = 0; j < n; j++) {

                for (int i = 0; i < m; i++) {

                    arr[i][j] = random.nextInt(2);
                    if (arr[i][j] == 1) {

                        if (count < j) {

                            count++;
                            arr[i][j] = 1;
                        } else {

                            arr[i][j] = 0;
                        }

                    } else {

                        if (count >= j){

                            arr[i][j] = 0;
                        } else {

                            arr[i][j] = 1;
                            count++;
                        }
                    }
                }

                count = 0;
            }
//        }

        Task4.print_mult_array(arr);

    }
}
