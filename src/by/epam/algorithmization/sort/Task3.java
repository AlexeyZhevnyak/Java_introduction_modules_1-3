package by.epam.algorithmization.sort;

//Сортировка выбором. Дана последовательность чисел.
// Требуется переставить элементы так, чтобы они были расположены по убыванию.
// Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего.
// Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.

public class Task3 {

    public static void main(String[] args) {

        int[] first_arr = {1, 8, 7, 2};
        int max;
        int temp;

        for (int i = 0; i < first_arr.length-1; i++){

            max = i;

            for (int j = i+1; j < first_arr.length; j++){

                if (first_arr[j] > first_arr[max])
                    max = j;
            }

            temp = first_arr[max];
            first_arr[max] = first_arr[i];
            first_arr[i] = temp;
        }

        for (int value : first_arr) {

            System.out.println(value);
        }
    }
}
