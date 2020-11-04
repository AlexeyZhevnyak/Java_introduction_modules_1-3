package by.epam.algorithmization.array;
//
//Даны действительные числа a(1), a(2), ..., a(2n) . Найти max(a(1)+a(2n), a(2)+a(2n-1), ...,a(n)+a(n+1)).
//
public class Task7 {
    public static void main(String[] args) {

        int t = 5;
        double[] a = new double[t];

        int n = a.length - 1;
        double sum = a[0] + a[n];
        double max = sum;

        Task1.init_arr(a);
        Task1.print_source_arr(a);

        for (int i = 1; i < n / 2 + 1; i++) {

            sum = a[i] + a[n - i];

            if (sum > max) {

                max = sum;

            }
        }

        System.out.println(max);
    }
}
