package by.epam.algorithmization.array;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//        положительных и нулевых элементов.

public class Task3 {
    public static void main(String[] args) {
        int n = 5;
        double[] arr = new double[n];
        int positive = 0;
        int negative = 0;
        int zero = 0;

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);

        for (double value : arr) {

            if (value > 0) {

                positive++;

            } else if (value < 0) {

                negative++;

            } else zero++;

        }

        System.out.println("Negative: " + negative + "\n"
                + "Positive: " + positive + "\n"
                + "Zero:" + zero + "\n");

    }
}
