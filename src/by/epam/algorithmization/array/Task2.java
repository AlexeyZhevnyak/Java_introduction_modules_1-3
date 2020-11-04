//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//        числом. Подсчитать количество замен.

package by.epam.algorithmization.array;

public class Task2 {
    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[n];
        double z = 6;
        int k = 0;

        Task1.init_arr(array);
        Task1.print_source_arr(array);

        for (int i = 0; i <array.length ; i++) {

            if (array[i] > z){

                array[i] = z;
                k++;

            }
            System.out.println(array[i]);

        }
        System.out.println(k);
    }
}
