package by.epam.algorithmization.decomp;

import by.epam.algorithmization.array.Task1;

//Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
public class Task5 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);
        sort_ar(arr);

        System.out.println(find_second_max(arr));
    }


    public  static void sort_ar(int[] arr){
        boolean isSorted = false;
        int buf;

        while(!isSorted) {

            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {

                if(arr[i] > arr[i+1]){

                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
    }

    public static int find_second_max(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] > arr[max]) && (arr[i] != arr[arr.length - 1])){

                max = i;
            }
        }

        return arr[max];
    }


}
