package by.epam.string.array_of_chars;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//        Крайние пробелы в строке удалить.
public class Task5 {

    public static void main(String[] args) {
        String str = "   I'm22  the first  11   ";
        String finalStr = "";
        char[] arr = str.toCharArray();
        int count = 0;
        int indexStart = 0;
        int indexEnd;

        while (isSpace(arr[indexStart])) indexStart++;
        indexEnd = str.length() - 1;
        while (isSpace(arr[indexEnd])) indexEnd--;

        boolean previousCharIsSpace = false;

        for (int i = indexStart; i < indexEnd; i++) {

            finalStr = (isSpace(arr[i]) && previousCharIsSpace) ? finalStr : finalStr + arr[i];
            previousCharIsSpace = isSpace(arr[i]);

        }




        System.out.println(finalStr + arr[indexEnd]);

    }

    public static boolean isSpace(char ch){
        return ch == 32;
    }
}
