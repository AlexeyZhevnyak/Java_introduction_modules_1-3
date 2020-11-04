package by.epam.algorithmization.decomp;
//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с
// номерами от k до m.

import by.epam.algorithmization.array.Task1;

public class Task8 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[5];

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);

        System.out.println(sum_calc(1,3, arr));
    }
    public static int sum_calc(int k, int m, int[] arr){
        int sum = 0;
        if (m - k + 1 == 3){

            for (int i = k; i <= m; i++) {

                sum += arr[i];
            }
        }
        return sum;

    }
}


