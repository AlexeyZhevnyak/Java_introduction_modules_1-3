package by.epam.algorithmization.array;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.

public class Task9 {
    public static void main(String[] args) {

        int n = 5;
        int[] arr = new int[n];
        int[] pop = new int[n];
        int data = arr[0];
        int value = arr[0];

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i]==arr[j]){

                    pop[i]++;

                }
            }
        }



        for (int i = 0; i <pop.length ; i++) {

            if (pop[i]>pop[data]){

                data = pop[i];
                value = arr[i];

            }

            if ((arr[i] < value) && (data == pop[i])){

                value = arr[i];

            }
        }

        System.out.println(value);

    }
}
