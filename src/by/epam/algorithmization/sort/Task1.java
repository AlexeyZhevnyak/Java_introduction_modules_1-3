package by.epam.algorithmization.sort;
// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив.

public class Task1 {
    public static void main(String[] args) {
        int[] first_arr = {1, 2, 3, 4};
        int[] sec_arr = {4, 5, 6, 7};
        int[] final_arr = new int[first_arr.length + sec_arr.length];

        int k = 1;

        System.arraycopy(first_arr, 0, final_arr, 0, k);

        System.arraycopy(sec_arr, 0, final_arr, k, sec_arr.length);

        System.arraycopy(first_arr,k, final_arr, sec_arr.length + k, first_arr.length - k);

        for (int value : final_arr) {

            System.out.println(value);
        }
    }
}
