
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//        (𝑏 + √𝑏(2 + 4𝑎𝑐))/2a -a^3c+b^-2



package by.epam.basic_of_software_code_development.linear_program;

public class  Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        a = 1;
        b = 2;
        c = 3;

        z = (b + Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b,-2);

        System.out.println(z);






    }
}
