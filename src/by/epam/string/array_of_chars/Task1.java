package by.epam.string.array_of_chars;

import java.util.Arrays;
// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task1 {
    public static void main(String[] args) {
        String[] arr_of_var = {"varFvar1", "varSvar2", "varTvar3"};
        String[] result_arr;

        result_arr = to_snake_case(arr_of_var);
        System.out.println(Arrays.toString(result_arr));
    }


    public static String[] to_snake_case(String[] arr_of_var){
        String[] result_arr = new String[3];
        String value;

        for (int i = 0; i < arr_of_var.length; i++) {
            value = "";
            value += arr_of_var[i].charAt(0);

            for (int j = 1; j < arr_of_var[i].length(); j++) {

                if (Character.isUpperCase(arr_of_var[i].charAt(j))) value += "_";
                value += Character.toLowerCase(arr_of_var[i].charAt(j));

            }
            result_arr[i] = value;
        }

        return result_arr;
    }
}
