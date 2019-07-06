import java.util.Scanner;

package geekbrains.lesson_1;


public class Main {

    public static void main(String[] args) {
	 System.out.println("Введите операцию:");
	 System.out.println("1. Сложение");
	 System.out.println("2. Вычитание");
	 System.out.println("3. Умножение");
        scanner scan  = new scanner(System.in);
        int operation = scan.nex tint();
        System.out.println("Введите первое число");
	 int a = scan.nextint ();
        System.out.println("Введите второе число");
	 int b = scanner.nextint ( );
	 int result;
	 if (operation == 1) {
         result = a + b;
     } else if (operation == 2) {
         result = a - b;
     } else {
            result = a * b;
	 }
	 System.out.println("Результат = " + result);
    }
}
