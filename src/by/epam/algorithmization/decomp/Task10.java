package by.epam.algorithmization.decomp;

import by.epam.algorithmization.array.Task1;

//Дано натуральное число N.
// Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
public class Task10 {
    public static void main(String[] args) {
        int number = 123, temp;
        int count;

        temp = number; // копия числа
        count = size(temp);

       int[] arr = filling(count, number);
        Task1.print_source_arr(arr);
    }

    public static int size(int temp){
        int count = 0;

        while(temp > 0)//этот цикл для определения размера массива
        {
            count++;
            temp /= 10;
        }

        return count;
    }

    public static int[] filling(int count, int number){
        int[] arr = new int[count];

        int j = count - 1;

        while(number > 0)
        {
            arr[j--] = number % 10;

            number /= 10;
        }

        return arr;
    }
}
