package hw;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.println("===== task 1 =====");
        // Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение
        // чисел от 1 до n)

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Num: ");
            int userNumber = scanner.nextInt();

            int triangleNumber = GetTriangleNumber(userNumber);
            int factorialNumber = GetFacorialNumber(userNumber);

            System.out.println("triangle number: " + triangleNumber);
            System.out.println("factorial number: " + factorialNumber);
        }
    }

    public static Integer GetTriangleNumber(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + GetTriangleNumber(num - 1);
        }
    }

    public static Integer GetFacorialNumber(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * GetFacorialNumber(num - 1);
        }
    }

}
