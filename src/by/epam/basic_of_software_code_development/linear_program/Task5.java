//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//        данное значение длительности в часах, минутах и секундах в следующей форме:
//        ННч ММмин SSc.


package by.epam.basic_of_software_code_development.linear_program;

public class Task5 {
    public static void main(String[] args) {

        int sec;

        sec = 10000;

        System.out.println(sec/3600
                +"ч " + sec % 3600 / 60 + "мин "
                +sec % 3600 % 60 + "с ");


    }
}
