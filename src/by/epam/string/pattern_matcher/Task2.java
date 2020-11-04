package by.epam.string.pattern_matcher;

/*
    Дана строка, содержащая следующий текст (xml-документ):
        <notes>
            <note id = "1">
                <to>Вася</to>
                <from>Света</from>
                <heading>Напоминание</heading>
                <body>Позвони мне завтра!</body>
            </note>
            <note id = "2">
                <to>Петя</to>
                <from>Маша</from>
                <heading>Важное напоминание</heading>
                <body/>
            </note>
        </notes>
    Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
    тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
    нельзя.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String str = getStringFromXML("C:\\Users\\Alex\\IdeaProjects\\DemoS\\src\\by\\epam\\string\\pattern_matcher\\file.xml");

        Pattern pattern1 = Pattern.compile("((?<openTag><[^/][^>]*[^/]>)(?<body>.*)(?<closeTag><[/][^>]*[^/]>))|(?<OnlyOpenTag><[^/][^>]*[^/]>)|(?<onlyCloseTag><[/][^>]*[^/]>)|(?<noBodyTag><[^>]*[/]>)");

        if (str != null) {
            System.out.println(str);
            Matcher matcher1 = pattern1.matcher(str);

            while (matcher1.find()) {
                if (matcher1.group("openTag") != null && matcher1.group("closeTag") != null) {
                    System.out.print("Open tag is: " + matcher1.group("openTag") + ". Close tag is: " + matcher1.group("closeTag") + ". Body is: " + matcher1.group("body") + "\n");
                }else if (matcher1.group("OnlyOpenTag") != null) {
                    System.out.print("Open tag is: " + matcher1.group("OnlyOpenTag"));
                    System.out.println();
                } else if (matcher1.group("onlyCloseTag") != null) {
                    System.out.print("Close tag is: " + matcher1.group("onlyCloseTag"));
                    System.out.println();
                } else if (matcher1.group("noBodyTag") != null) {
                    System.out.print("No body tag is: " + matcher1.group("noBodyTag"));
                    System.out.println();
                }
            }
        }
    }


    public static String getStringFromXML(String filepath) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filepath));
        String line;
        StringBuilder strFromXML = new StringBuilder();

        while((line = bf.readLine()) != null){
            strFromXML.append(line.trim() + "\n");
        }
        return strFromXML.toString();

    }
}
