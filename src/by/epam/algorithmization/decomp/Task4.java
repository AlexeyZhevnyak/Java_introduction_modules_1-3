package by.epam.algorithmization.decomp;

import by.epam.algorithmization.array.Task1;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
// Указание. Координаты точек занести в массив
public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        int[] x = new int[n];
        int[] y = new int[n];
        double[][] distance;

        Task1.init_arr(x);
        Task1.init_arr(y);

        distance = find_distance(x, y);

        print_arr(distance);
    }

    public static double[][] find_distance(int[] x, int[] y){
        double[][] distance = new double[x.length][y.length];
        double d;

        for (int i = 0; i < x.length; i++) {

            for (int j = 0; j < y.length; j++) {

                if (i != j){

                    distance[i][j] = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                }
            }
        }
        return distance;
    }


    public static void print_arr(double[][] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%7.2f",arr[i][j]);
            }

            System.out.println();
        }
    }
}
