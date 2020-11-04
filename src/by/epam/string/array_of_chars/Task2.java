package by.epam.string.array_of_chars;
//Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {
    public static void main(String[] args) {
        String string = "hello word";

        System.out.println(replace(string));
    }

    public static String replace(String string){
        char[] charsOfString = string.toCharArray();
        String stringFinal = "";

        for (int i = 0; i < charsOfString.length; i++) {

            if (charsOfString[i] == 'w' && charsOfString[i+1] == 'o' && charsOfString[i+2]
                    == 'r' && charsOfString[i+3] == 'd') {

                stringFinal += "letter";
                i += 3;

            } else {

                stringFinal += charsOfString[i];
            }
        }
        return stringFinal;
    }
}
