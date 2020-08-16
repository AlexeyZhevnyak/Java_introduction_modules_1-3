package by.epam.algorithmization.array;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//        являются простыми числами.

public class Task6 {
    public static void main(String[] args) {
        int n = 5;
        double[] arr = new double[n];
        double sum = 0;
        boolean isPrime = true;
        double temp;

        Task1.init_arr(arr);
        Task1.print_source_arr(arr);

        for (int i = 2; i < arr.length; i++) {

            for (int j = 2; j <= i / 2; j++) {

                temp = (i % j);

                if (temp == 0) {

                    isPrime = false;

                }

            }

            if (isPrime){

                System.out.println(i);
                sum += arr[i];

            } else isPrime = true;


        }

        System.out.println(sum);
    }


}
