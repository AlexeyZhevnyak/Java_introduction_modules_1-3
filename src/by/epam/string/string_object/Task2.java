package by.epam.string.string_object;
// В строке вставить после каждого символа 'a' символ 'b'
public class Task2 {
    public static void main(String[] args) {
        String value = " I'm      free aaa         ";
        StringBuilder finalStr = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {

            char c = value.charAt(i);
            finalStr.append(c);
            if (c == 'a') finalStr.append('b');
        }

        System.out.println(finalStr);
    }
}
