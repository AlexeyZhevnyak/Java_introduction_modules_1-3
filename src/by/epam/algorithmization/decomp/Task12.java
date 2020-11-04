package by.epam.algorithmization.decomp;

import by.epam.algorithmization.array.Task1;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых
// равна К и которые не большее N.
public class Task12 {
    public static void main(String[] args) {
        int c = 10;
        int[] arr = new int[10];
        int k = 1982;
        int n = 25;
        fill(arr, n, k, c);

        Task1.print_source_arr(arr);
    }

    public static int sum(int n){
        int s = 0;

        while (n != 0){
            s = s + n % 10;
            n /= 10;

        }
        return s;
    }

    public static void fill(int[] arr, int n, int k, int c){

        c = 0;
        for (int i = 0; i < n; i++) {

            if (sum(i) == k){

                c++;
                arr[c] = i;
            }
        }

    }
}
