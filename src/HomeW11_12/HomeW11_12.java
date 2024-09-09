package HomeW11_12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeW11_12 {
    public static void main(String[] args) {

      /*  Задание по Урокам 11-12 Ветвление (условные операторы)
        1
        Напишите программу, которая определяет, в какое учреждение необходимо отправить человека в зависимости от его возраста. */

        Scanner sc = new Scanner(System.in);


        System.out.println("Введите ваш возраст ");
        int age = sc.nextInt();

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека " + age + ", то ему стоит пойти в садик");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека " + age + ", вам нужно посещать школу");
        } else if (age > 18 && age <= 23) {
            System.out.println("Если возраст человека " + age + ", вам нужно посещать универстите");
        } else if (age >= 24 && age <= 50) {
            System.out.println("Если возраст человека " + age + ", вам пора идти на работу");
        } else System.out.println("Введите корректный возраст");



/*          2
            Вам поставили задачу автоматизировать повышение зарплаты для сотрудников:
            •	Диана получает 66 660 рублей в месяц.
            •	Андрей получает 77 770 рублей в месяц.
        	•   Мария получает 88 880 рублей в месяц.
                Каждому нужно увеличить зарплату на 15% от текущей. Также нужно посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
                Выведите в консоль информацию по каждому сотруднику. Например: «… теперь получает ... рублей. Годовой доход вырос на ... рублей». */

        double dianaSalary = 66660;
        double andreySalary = 77770;
        double maryaSalary = 88880;

        double increasePercent = 15.0;

        // Также нужно посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        // Для дианы

        double dianaNewSalary = dianaSalary + (dianaSalary * increasePercent / 100);
        double dianaAnnualDifference = (dianaNewSalary - dianaSalary) * 12;

        // Вычисление новой зарплаты и разницы в годовом доходе для Андрея
        double andreyNewSalary = andreySalary + (andreySalary * increasePercent / 100);
        double andreyAnnualDifference = (andreyNewSalary - andreySalary) * 12;

        // Вычисление новой зарплаты и разницы в годовом доходе для Марии
        double mariaNewSalary = maryaSalary + (maryaSalary * increasePercent / 100);
        double mariaAnnualDifference = (mariaNewSalary - maryaSalary) * 12;

        // Вывод информации по каждому сотруднику
        System.out.println("Диана теперь получает " + (int) dianaNewSalary + " рублей. Годовой доход вырос на " + (int) dianaAnnualDifference + " рублей.");
        System.out.println("Андрей теперь получает " + (int) andreyNewSalary + " рублей. Годовой доход вырос на " + (int) andreyAnnualDifference + " рублей.");
        System.out.println("Мария теперь получает " + (int) mariaNewSalary + " рублей. Годовой доход вырос на " + (int) mariaAnnualDifference + " рублей.");

// 3
//   (Switch) Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
//    Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber.
//    Обратите внимание, что в switch должно быть четыре case! Т.е. некоторые месяцы надо объединить внутри кейсов

        Scanner mN = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");
        int monthNumber = sc.nextInt();

        String message = switch (monthNumber) {

            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Такого месяца нету";
        };
            System.out.println(message);

            message = switch(monthNumber) {
                case 1, 2, 12  -> "Зима";
                case 5,4,3     -> "Весна";
                case 6,7,8     -> "Лето";
                case 9, 10, 11 -> "Осень";
                default -> "Неверное значение";
            };
        System.out.println(message);



    }
}