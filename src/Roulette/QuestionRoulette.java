package Roulette;

import java.util.Random;
import java.util.Scanner;

public class QuestionRoulette {
    public static void main(String[] args) {

      /* int firstAnswer = 0;
       int secondAnswer = 0;

        Random rand = new Random();
        int numberForAnswer = rand.nextInt(1,30);

        if (numberForAnswer != firstAnswer) {

        }

        System.out.println("Отвечает номер " + numberForAnswer);  */


        /* Scanner sc = new Scanner(System.in);
        System.out.print("input day number: ");
        int dayNumber = sc.nextInt();
        String number = ("пн");

        String message = switch (dayNumber) {
            case 1 -> "пн";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Неверный номер дня недели";

        };
        System.out.printf(message);  */



        /*
    У клиента есть выбор из трёх категорий блюд: завтрак, обед и ужин.
Клиент указывает, голоден ли он сейчас или просто хочет что-то лёгкое.

    Если клиент голоден и выбрал:
Завтрак: предложить омлет с тостами.
Обед: предложить стейк с картофелем.
Ужин: предложить пасту с соусом.

    Если клиент не голоден и выбрал:
Завтрак: предложить йогурт с фруктами.
Обед: предложить салат с курицей.
Ужин: предложить суп-пюре.

    Дополнительно, программа должна предложить напиток:
Если клиент выбрал завтрак, предложить кофе.
Если обед или ужин — предложить сок.
*/

        Scanner scanner = new Scanner(System.in);

// Ввод данных
        System.out.println("Введите категорию (завтрак, обед, ужин): ");
        String eat = scanner.next().toLowerCase();


        System.out.println("Вы голодны? (да/нет): ");
        
        boolean isHungr = scanner.nextBoolean();


        
        /*
    У клиента есть выбор из трёх категорий блюд: завтрак, обед и ужин.
Клиент указывает, голоден ли он сейчас или просто хочет что-то лёгкое. */
        System.out.println("Предлагаем вам: ");
        String dish;
        if (isHungr) {
            dish = switch (eat) {
                case "завтрак" -> "омлет с ветчиной";
                case "обед" -> "курица с сыром";
                case "ужин" -> "лосось с пюре";
                default -> "ошибка";
            };
            }   else {    
                dish = switch (eat) {
                    case "завтрак" -> "Йогурт с мясом";
                    case "обед" -> "каре ягненька";
                    case "ужин" -> "сок с печенькой";
                    default -> "ошибка";
                };
            }
            
            
        }
    }