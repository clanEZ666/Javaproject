package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class hw19_20 {
    public static void main(String[] args) {

        ValueAverage();
        MinValueAndMaxValue();
        vowelLetter();
        SymbolReplace();
        SplitText();

    }

    // Найдите среднее значение
    static void ValueAverage() {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Среднее значение: " + average);

    }

    //Найдите максимальное и минимальное значение в массиве вещественных чисел double[]
    static void MinValueAndMaxValue() {
        double[] array = {3.5, 5.2, -1.4, 7.8, 2.2};
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }

    static void vowelLetter() {
        char[] chars = {'a', 'B', 'i', 't', 'E', 'r'};
        String vowels = "AEIOUaeiou";

        System.out.println("Гласные буквы: ");
        for (char vovLett : chars)
            if (vowels.indexOf(vovLett) != -1) {
                System.out.print(vovLett + " ");
            }
    }

    static void SymbolReplace() {

        String str = "Hello World This Is Java";

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                ch[i] = '_';
            }
        }
        String result = new String(ch);
        System.out.println(result);

    }

    static void SplitText() {
        String str = "apple,banana,grape,orange";

        String[] str1 = str.split(",");

        StringBuilder result = new StringBuilder();
        result.append("[");

        for (int i = 0; i < str1.length; i++) {
            result.append("\"").append(str1[i]).append("\"");
            if (i < str1.length - 1) {
                result.append(", ");
            }

        }
        result.append("]");
        System.out.println(result.toString());


    }

}
