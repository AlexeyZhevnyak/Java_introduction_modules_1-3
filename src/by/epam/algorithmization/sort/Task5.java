package by.epam.algorithmization.sort;

// Сортировка вставками. Дана последовательность чисел.
// Требуется переставить числа в порядке возрастания.
// Делается это следующим образом. Пусть ai, ai+1 ... - упорядоченная последовательность, т. е. ai < ai+1 < ... .
// Берется следующее число ai+1  и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
// Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
// Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
// Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        int[] array = {10, 2, 10, 3, 1, 2, 5};


        for (int left = 0; left < array.length; left++) {

            int value = array[left];
            int i = left - 1;

            for (; i >= 0; i--) {

                if (value < array[i]) {

                    array[i + 1] = array[i];

                } else {

                    break;
                }
            }
            array[i + 1] = value;
        }
        for (int value : array) {

            System.out.println(value);
        }


    }

    public static int search(int[] arr, int a){
        int m;
        int j;
        int i = 0;

        m = arr.length / 2;
        j = arr.length - 1;

        while ((arr[m] != a) && (i <= j)){

            if (a > arr[m]){

                i = m + 1;
            } else  j = m - 1;

            m = (i + j) / 2;
        }

        return (i > j) ?  0 : m;

    }
}
