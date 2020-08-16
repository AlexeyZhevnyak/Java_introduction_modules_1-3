package by.epam.algorithmization.array;
// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > i){

                System.out.println(arr[i]);

            }
        }

    }
}
