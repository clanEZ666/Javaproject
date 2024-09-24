package String_HW;

import java.util.Scanner;

import static java.util.Collections.reverseOrder;

public class HW_17_18 {
    public static void main(String[] args) {
        isPolindrom();
        isPolindromReverse();
        isAnalyzeCharacter();
        AnalyzeDigit();
    }

    static void isPolindrom() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите палиндром: ");
        String st = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = st.length() - 1; i >= 0; --i) {
            sb.append(st.charAt(i));
        }

        if (st.equals(sb.toString())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Не палиндром");
        }

        System.out.println(sb);
    }

    //    a.	С помощью СтрингБилдера получить реверс строки (строку в обратном порядке символов) и сравнить её с исходной строкой
    static boolean isPolindromReverse() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите палиндром: ");
        String st = sc.nextLine();

        StringBuilder reversed = new StringBuilder(st).reverse();
        System.out.println("Символы в обратном порядке: " + reversed);

        if (st.equals(reversed.toString())) {
            System.out.println("Это палиндром");
            return true;
        } else {
            System.out.println("Не палиндром");
            return false;

        }


    }


// b.	Анализировать посимвольно строку – сравнивать первый символ с последним, второй с предпоследним и т.д.
    static boolean isAnalyzeCharacter() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = sc.nextLine(); // Считываем строку от пользователя

        int length = input.length(); // Получаем длину строки
        System.out.println("Длина строки: " + input.length());

        // Сравниваем символы посимвольно
        for (int i = 0; i < length / 2; i++) {

            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                System.out.println("Строка не палиндром: " + input);
                return false;

            }

        }
        System.out.println("Строка является палиндромом: " + input);
        return true;

    }

  //  c.	* подумать – как можно проверить на палиндром число, например 1234321

    static void AnalyzeDigit() {

        String str = "1234321";
        boolean isAnalyzeDigit = true;

        for (int i = 0; i < (str.length() / 2); i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isAnalyzeDigit = true;
                break;
            }
        }

        if (isAnalyzeDigit) {
            System.out.println(str + " это палиндром");
        } else {
            System.out.println(str + " это не палиндром.");
        }

    }

    }










