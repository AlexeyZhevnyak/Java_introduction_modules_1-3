package by.epam.algorithmization.decomp;
// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Task14 {
    public static void main(String[] args) {
        find_Armstr(100000);
    }

    public static void find_Armstr(int k){
        int n;
        double sum;


        for (int i = 1; i <= k; i++) {

            n = Task10.size(i);
            int[] arr = Task10.filling(n, i);
            sum = find_sum(arr, n);

            if (sum == i) System.out.println(i);
        }
    }

    public static int find_sum(int[] a, int n){
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum += Math.pow(a[i], n);
        }
        return sum;
    }
}
