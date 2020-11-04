//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//        (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)  * tg(xy)



package by.epam.basic_of_software_code_development.linear_program;

public class Task3 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        x = 1.0;
        y = 2.0;
        z = 3.0;


        z= ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);

        System.out.println(z);


    }
}
