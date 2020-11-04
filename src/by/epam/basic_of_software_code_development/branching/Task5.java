
//Вычислить значение функции:

package by.epam.basic_of_software_code_development.branching;

public class Task5 {
    public static void main(String[] args) {
        int x = 7;
        if (x<=3){

            System.out.println(calc1(x));

        }else System.out.println(calc2(x));

    }


    public static double calc1(int x){

       return  Math.pow(x,2)-3*x+9;

    }

    public static double calc2(int x){

        return 1/(Math.pow(x,3)+6);

    }
}
