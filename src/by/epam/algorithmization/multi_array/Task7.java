package by.epam.algorithmization.multi_array;
/*
Сформировать квадратную матрицу порядка n по правилу:
a[i, j] = sin((i^2 - j^2)/n)
и подсчитать количество положительных элементов в ней.
 */
public class Task7 {
    public static void main(String[] args) {

        int n = 3;
        int k = 0;
        double [][] arr = new double [n][n];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = Math.sin((Math.pow(i,2) - Math.pow(j,2)) / n );

                if (arr[i][j] > 0){

                    k++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%7.2f",arr[i][j]);
            }

            System.out.println();
        }

        System.out.println("Count of positive is: " + k);
    }
}
