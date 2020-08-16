package by.epam.algorithmization.array;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать

public class Task10 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        int length;

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);

        length = arr.length - 1;

        for (int i = 1; i < arr.length; i += 2) {

            arr[i] = arr[i + 1];
            arr[length] = 0;
            length--;

        }

        for (int value : arr) {

            System.out.println(value);

        }
    }
}
