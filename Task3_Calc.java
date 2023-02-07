import java.util.Scanner;

// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *).
// int a ; int b; String op (op!=”Stop”); (char != ’b’)
public class Task3_Calc {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String operation = "+";
        while (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {

            System.out.println("Введите операцию: ");
            operation = iScanner.next();
            System.out.println("Введите 1-ое число: ");
            float a = iScanner.nextFloat();
            System.out.println("Введите 2-ое число: ");
            float b = iScanner.nextFloat();

            switch (operation) {
                case "+" -> {
                    float res = a + b;
                    System.out.println(a + " + " + b + " = " + res);
                    System.out.println("Чтобы выйти из калькулятора, вместо операции напишите 'stop'.\n");
                }
                case "-" -> {
                    System.out.println(a + " - " + b + " = " + (a - b));
                    System.out.println("Чтобы выйти из калькулятора, вместо операции напишите 'stop'.\n");
                }
                case "*" -> {
                    System.out.println(a + " * " + b + " = " + (a * b));
                    System.out.println("Чтобы выйти из калькулятора, вместо операции напишите 'stop'.\n");
                }
                case "/" -> {
                    System.out.println(a + " / " + b + " = " + (a / b));
                    System.out.println("Чтобы выйти из калькулятора, вместо операции напишите 'stop'.\n");
                }
                case "stop" -> {
                    System.out.println("Приходите еще :)");
                }
                default -> System.out.println("Введите корректный знак");
            }

        }
        iScanner.close();
    }
}
