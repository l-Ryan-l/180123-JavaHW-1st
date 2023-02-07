import java.util.Scanner;

//Task 1:
//Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//        n! (произведение чисел от 1 до n)
public class Task1_N_Triangle {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = iScanner.nextInt();
        SumOfTriangle(n);
        FactorialOfTriangle(n);
        iScanner.close();

    }
    public static void SumOfTriangle(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);

    }

    public static void FactorialOfTriangle(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        System.out.println("Факториал числа " + n + " = " + result);

    }

}
