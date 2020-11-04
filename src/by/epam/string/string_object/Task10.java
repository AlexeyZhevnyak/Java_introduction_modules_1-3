package by.epam.string.string_object;
// Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным
// или вопросительным знаком. Определить количество предложений в строке X.

public class Task10 {
    public static void main(String[] args) {
        String string = "Haha, I'm here. Try to catch me! JIII?";
        String[] sentences = string.split("[.?!]");

        System.out.println(sentences.length);
    }
}
