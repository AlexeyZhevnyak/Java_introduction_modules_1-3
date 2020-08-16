package by.epam.algorithmization.decomp;

import java.util.Scanner;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
public class Task16 {

    public static void main(String[] args) {
        int sum = 0;
        int [] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {

            if (num(arr[i])){

                sum += arr[i];
            }
        }

        System.out.println(sum);
        System.out.println(num2(sum));
    }

    public static boolean num(int a) {
        boolean flag = true;

        while (a > 9){

            if ((a % 10) % 2 != 0){

                a /= 10;

            } else {

                flag = false;
                break;
            }
        }

        if (a % 2 == 0){

            flag = false;
        }

        return flag;
    }

    public static int num2(int s){
        int i = 0;

        while (s > 9){

            if ((s % 10) % 2 == 0) i++;

            s /= 10;
        }
        if ((s % 2 == 0) && (s != 0)) i++;

        return i;
    }
}
