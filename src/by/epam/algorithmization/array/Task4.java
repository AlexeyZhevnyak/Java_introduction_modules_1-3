package by.epam.algorithmization.array;
// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        double[] arr = new double[n];
        int minIndex = 0;
        int maxIndex = 0;

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < arr[minIndex]) {

                minIndex = i;

            }

            if (arr[i] > arr[maxIndex]) {

                maxIndex = i;

            }
        }

        double temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        for (double v : arr) {
            System.out.println(v);
        }

    }
}
