package by.epam.algorithmization.decomp;
//   Из заданного числа вычли сумму его цифр.
//   Из результата вновь вычли сумму его цифр и т.д.
//   Сколько таких действий надо произвести, чтобы получился нуль?
//   Для решения задачи использовать декомпозицию

public class Task17 {
    public static void main(String[] args) {
        int a = 123;
        int[] arr;
        int count = 0;
        System.out.println(a);

        do {

            arr = Task10.filling(Task10.size(a), a);
            a -= find_sum(arr);
            System.out.println(a);
            count++;

        }while (a != 0);

        System.out.println("Count: " + count);
    }

    public static int find_sum(int[] a){
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];
        }
        return sum;
    }




}
