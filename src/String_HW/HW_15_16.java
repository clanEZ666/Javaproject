package String_HW;

import java.util.Locale;
import java.util.Scanner;

public class HW_15_16 {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

static void task1() {

//  1)	Написать код, который подсчитывает количество букв и цифр в строке (как на занятии) – с циклом, методом charAt(индекс) и Character.isLetter/isDigit,
//  a.	но добавить еще условие, чтобы подсчитывались отдельно цифры от 0 до 4, отдельно от 5 до 9
//  b.	для букв так же – считать отдельно большие буквы и маленькие (поищите в классе Character подходящие методы, подсказка – они тоже начинаются на is)
//  c.	(т.е. должно быть четыре счетчика – два для букв и два для цифр)

    String text = "1Q2w3e4R5t6Y7u8i9o";


    int countDigit0to4 = 0;
    int countDigit5to9 = 0;
    int countUpperCaseLetters = 0;
    int countLowerCaseLetters = 0;


    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);

        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                countUpperCaseLetters++;
            } else if (Character.isLowerCase(ch)) {
                countLowerCaseLetters++;
            }
        } else if (Character.isDigit(ch)) { //
            int digit = Character.getNumericValue(ch);
            if (digit >= 0 && digit <= 4) {
                countDigit0to4++;
            } else if (digit >= 5 && digit <= 9) {
                countDigit5to9++;
            }
        }
    }

    System.out.println("Количество заглавных букв: " + countUpperCaseLetters);
    System.out.println("Количество строчных букв: " + countLowerCaseLetters);
    System.out.println("Количество цифр от 0 до 4: " + countDigit0to4);
    System.out.println("Количество цифр от 5 до 9: " + countDigit5to9);

    }



static void task2() {

 //  2)	Написать любую строку на ваш вкус (можно “I like Java!!!”), далее
    //a.	Распечатать последний символ строки. Используем метод String.charAt().
    //b.	Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
    //c.	Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
    //d.	Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    //e.	Найти позицию подстроки “Java” в строке “I like Java!!!”.
    //f.	Заменить все символы “а” на “о”.
    //g.	Преобразуйте строку к верхнему регистру.
    //h.	Преобразуйте строку к нижнему регистру.


        String textString = "I like Java!!!";


            System.out.println(" Длина всей строки: " + textString.length());
            System.out.println("a) Послдений символ строки: " + " : " + textString.charAt(13));
            System.out.println("b) Строчка заканчивается: \"!!!\": " + textString.endsWith("!!!"));
            System.out.println("c) Строка начинается с \"I like\": " + textString.startsWith("I like"));
            System.out.println("d) Моя строка содержит подстроку \"Java\": " + textString.contains("Java"));

            int index = textString.indexOf("Java");

            if (index != -1) {
                System.out.println("e) Позиция подстроки 'Java': " + index);
            } else {
             System.out.println("Подстрока 'Java' не найдена.");
             }

            String newStr = textString.replace("a","o");
            System.out.println("f) Замена всех символов \"a\" на \"o\": " + newStr);

            System.out.println("g) Верхний регистр: " + textString.toUpperCase());
            System.out.println("f) Нижний регистр: " + textString.toLowerCase());


    }

static void task3() {

      //3)	Даны строки разной длины (длина - четное число), необходимо вернуть два средних знака. Например,
      //      если дана строка "string" –  результат будет "ri", для строки "code" результат "od",  для "Practice"
      //      результат "ct" (тут надо взять длину и поиграться с индексами, чтобы взять тот кусок, который нужен,
      //      ну и применять метод substring). Проверьте алгоритм на нескольких строках разной длины

    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите строчку с четной длиной: ");
    String input = scanner.nextLine();

    if (input.length() % 2 != 0) {
        System.out.println("Длина строки должна быть четной.");
    } else {
        System.out.println("Два средних символа: " + MiddleTwoChars(input));
    }

}

    public static String MiddleTwoChars(String str) {
        int length = str.length();
        int middleIndex = length / 2;
        return str.substring(middleIndex - 1, middleIndex + 1);
    }



}




















