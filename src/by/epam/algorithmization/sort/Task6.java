package by.epam.algorithmization.sort;
//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1 ,
// то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и
// сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

public class Task6 {
    public static void main(String[] args) {
        double[] array = {10, 2, 10, 3, 1, 2, 5};
        double x;

        for (int i = array.length / 2; i > 0; i /= 2) {

            for (int j = i; j < array.length; j++) {

                for (int k = j - i; k >= 0 && array[k] > array[k + i] ; k -= i) {

                    x = array[k];
                    array[k] = array[k + i];
                    array[k + i] = x;
                }
            }
        }

        for (double value : array) {

            System.out.println(value);
        }
    }
}
