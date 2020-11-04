package by.epam.string.string_object;
// Из заданной строки получить новую, повторив каждый символ дважды
public class Task6 {
    public static void main(String[] args) {
        String string = "JavaIn";
        StringBuilder finalStr = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            finalStr.append(ch).append(ch);
        }

        System.out.println(finalStr);
    }
}
