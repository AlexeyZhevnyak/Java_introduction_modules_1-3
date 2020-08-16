
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//        дробную и целую части числа и вывести полученное значение числа.


package by.epam.basic_of_software_code_development.linear_program;

public class Task4 {
    public static void main(String[] args) {

        double x;
        double y;

        x = 123.456;

        y = (x * 1000) % 1000 + (int) x / 1000.0;

        System.out.println(y);
    }
}
