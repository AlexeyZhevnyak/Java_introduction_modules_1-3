package by.epam.string.pattern_matcher;

/*
    Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
    операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
    отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
    алфавиту.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        String text = "The Republic of Belarus (Belarus) is located in the Eastern part of Europe." +
                " The country is divided into six regions (oblasts): Brest, Homiel, Hrodna, Mahiliou, Minsk and Viciebsk.\n" +
                "The capital city of Belarus is Minsk!" +
                " Minsk is the biggest political, economic, scientific and cultural centre of the country. " +
                "The population of Minsk is 1982500 (beginning of 2018) people. \n" +
                "The territory of Belarus covers 207595 square kilometres...\n";

        System.out.println(text + "\n");
        System.out.println("1. Sort paragraphs by number of sentences.");
        System.out.println("2. Sort words by length in each sentence.");
        System.out.println("3. Sort lexemes in a sentence in descending order of occurrences of a given character, and in case of equality - alphabetically.");
        System.out.println("0. Exit.");
        System.out.print("Enter menu item (index number from 1 to 3): ");

        String[] paragraphs = text.split("\\n");
        String[] sentences = text.split("\\s*\\?|!|\\.\\s*");
        int[] num_Of_sent = new int[paragraphs.length];

        choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                sortPar(num_Of_sent, paragraphs);
                for (int i = 0; i < num_Of_sent.length; i++) {
                    System.out.println(paragraphs[i]);
                }
            }
            case 2 -> sortWords(sentences);
            case 3 -> lexemes(sentences);
        }
    }


    private static void sortArray (int[] array, String[] text) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            String tempStr = text[i];
            for (int j = i; j > 0 && array[j-1] > temp ; j--) {
                array[j] = array[j-1];
                array[j-1] = temp;
                text[j] = text[j-1];
                text[j-1] = tempStr;
            }

        }
    }

    private static void sortPar(int[] num_Of_sent, String[] paragraphs) {

        Pattern pattern = Pattern.compile("\\s*\\?|!|\\.+\\s*");

        for (int i = 0; i < paragraphs.length; i++) {

            Matcher matcher = pattern.matcher(paragraphs[i]);
            num_Of_sent[i] = 0;

            while (matcher.find()) num_Of_sent[i]++;
        }

        sortArray(num_Of_sent, paragraphs);
    }

    private static void sortWords(String[] sentences) {

        for (int i = 0; i < sentences.length; i++) {

            String[] words = sentences[i].split("\\s*\\W+\\b");
            int[] num_of_chars  = new int[words.length];

            for (int j = 0; j < num_of_chars.length; j++) {

                num_of_chars[j] = words[j].length();
            }
            sortArray(num_of_chars, words);
            for (int j = 0; j < words.length; j++) {

                System.out.println(words[j] + " ");
            }
            System.out.println();
        }
    }

    private static void lexemes(String[] sentences) {

        System.out.print("Enter number of sentence: ");
        int numberOfSentence;
        while ((numberOfSentence = sc.nextInt()) > sentences.length) {

            System.out.println("Number must be from 1 to " + sentences.length + ". Enter the number: ");
        }
        System.out.print("Enter a character in lowercase for sorting: ");
        String charForSort = sc.next();
        String sentenceForSort = sentences[numberOfSentence - 1].toLowerCase();
        String[] sentenceArr = sentenceForSort.split("\\W+");
        Arrays.sort(sentenceArr);
        int[] numOfChar = new int[sentenceArr.length];
        Pattern pattern2 = Pattern.compile(charForSort);
        for (int i = 0; i < sentenceArr.length; i++) {

            Matcher matcher2 = pattern2.matcher(sentenceArr[i]);

            while (matcher2.find()) {

                numOfChar[i]++;
            }
        }
        sortArray(numOfChar, sentenceArr);
        for (String word : sentenceArr) {

            System.out.println(word + " ");
        }

    }


    }

