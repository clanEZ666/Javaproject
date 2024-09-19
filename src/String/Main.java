package String;

public class Main {
    public static void main(String[] args) {
        String text = "1q23we";
        // index  порядок
        //  0       1
        //  1       2
        //  2       3


        int countLetter = 0;
        int countDigit = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                ++countLetter;
                System.out.println("letter" + countLetter);
            } else if (Character.isDigit(text.charAt(i))) {
                ++countDigit;
                System.out.println("digit" + countDigit);
            }
        }
        System.out.println("Кол-во цифр: " + countDigit);
        System.out.printf("Кол-во букв: " + countLetter);



    }
}
