package by.epam.algorithmization.array;

/*
 Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность, выбросив из исходной те члены,
 которые равны min(a1, a2, ..., an).
 */

public class Task8 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        int k = 0;
        int min = 0;

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<arr[min]){

                min = i;

            }
        }


        for (int value : arr) {

            if (value != arr[min]) {

                k++;

            }
        }

        if (k != 0){

            int j = 0;
            int[] resArr = new int[k];

            for (int value : arr) {

                if (value != arr[min]) {

                    resArr[j] = value;
                    System.out.println(resArr[j]);
                    j++;

                }
            }
        }
    }
}
