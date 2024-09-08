import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //      1)	Объявить и инициализировать переменные всех 8 типов примитивов

      /*  byte myByte = 50;
        short myShort = 50;
        int myInt = 2_500_000;
        long myLong = 5000L;
        float myFloat = 6500;
        double myDouble = 12.0;
        char myChar = 'b';
        boolean myBoolean = true; */

        //       2) Арифмитические операции с целыми числами

      /*
        int a = 50;
        int b = 20;

        int summa =  a + b;
        System.out.println("Cложение: " + summa);

        int difference = a - b;
        System.out.println("Вычитание: " + difference);

        int product = a * b;
        System.out.println("Умножение: " + product);

        int quotient = a / b;
        System.out.println("Деление: " + quotient);

        int remainder = a % b;
        System.out.println("Остаток от деления: " + remainder);
                                                                    */


 //       Задание по Урокам 7-8 Приведение типов, аномалии

//   1)	Дополнить прошлый код, где делали операции с переменными - написать сканнер, в нем принимать из консоли эти числа перед арифметическими операциями

      /*  Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение для x: ");
        int x = sc.nextInt();
        System.out.print("Введите значение для y: ");
        int y = sc.nextInt();


        int sumD = x + y;
        int differenceD = x-y;
        int productD = x * y;
        int quotientD = x / y;
        int remainderD = x % y;

        System.out.println("Сложение: " + sumD);
        System.out.println("Вычитание: " + differenceD);
        System.out.println("Умножение: " + productD);
        System.out.println("Деление" + (quotientD));
        System.out.println("Остаток от деления" + remainderD);   */


//        2)	Использовать класс Random для генерации нескольких четырех случайных чисел, которые после этого привести к типу char и вывести их в консоль в одно слово (метод print)

      /*  Random rn = new Random();

        int a = rn.nextInt(10,100);
        int b = rn.nextInt(10,100);
        int c = rn.nextInt(10,100);
        int d = rn.nextInt(10,100);

        System.out.println("Число 1: " + a);
        System.out.println("Число 2: " + b);
        System.out.println("Число 3: " + c);
        System.out.println("Число 4: " + d);

        // Приведение чисел к типу char
        char charA = (char) a;
        char charB = (char) b;
        char charC = (char) c;
        char charD = (char) d;

        // Вывод в консоль в одно слово
        System.out.print("Случайные символы: ");
        System.out.print(charA);
        System.out.print(charB);
        System.out.print(charC);
        System.out.print(charD);  */

 //       3)	Сделать переполнение типа int (привести тип long к типу int), вывести в консоль long и полученный переполненный int

      /*  long largeValue = 2147483648L;
        int overflowedValue = (int) largeValue;

        System.out.println("Вывод long: " + largeValue);
        System.out.println("Значение после переполненния (int): " + overflowedValue);   *

    }
}




