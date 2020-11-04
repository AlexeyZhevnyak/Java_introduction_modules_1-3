package by.epam.algorithmization.decomp;
// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Task7 {
    public static void main(String[] args) {

        System.out.println(calc_sum_factorial());
    }

    public static int calc_sum_factorial(){
        int factorial = 1;
        int sum = 0;
        for (int i = 1; i <= 9; i+= 2) {

            for (int j = 1; j <= i; j++) {

                factorial *= j;
            }
            sum += factorial;
            factorial = 1;

        }
            return sum;
    }
}
