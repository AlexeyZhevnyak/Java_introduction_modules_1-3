package by.epam.algorithmization.sort;
//Сортировка обменами
//Дана последовательность чисел.
// Требуется переставить числа в порядке возрастания.
// Для этого сравниваются два соседних числа Ai и Ai+1 . Если Ai > Ai+1 , то делается перестановка.
// Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок
public class Task4 {
    public static void main(String[] args) {
        int[] first_arr = {9, 2, 7, 8, 1};
        int temp;
        int count = 0;
        boolean isSorted = false;


        while(!isSorted) {

            isSorted = true;

            for (int i = 0; i < first_arr.length-1; i++) {

                if(first_arr[i] > first_arr[i+1]){

                    isSorted = false;

                    temp = first_arr[i];
                    first_arr[i] = first_arr[i+1];
                    first_arr[i+1] = temp;

                    count++;
                }
            }
        }

        for (int value : first_arr) {

            System.out.println(value);
        }

        System.out.println("Count of swaps: " + count);

    }
}
