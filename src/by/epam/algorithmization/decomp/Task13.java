package by.epam.algorithmization.decomp;
//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.


public class Task13 {
    public static void main(String[] args) {

        find_num(5);
    }
    
    public static void find_num(int n){
        int a;
        for (int i = n; i <= 2 * n; i++) {

            a = i + 2;

            if (a <= 2 * n) {

                System.out.println(i + " " + a);
            }
        }
    }
}
