import java.util.Scanner;

public class Problema2 {
    static void cadenaNumeros(int num1, int num2) {

        for (int i = num1; i < num2; i++) {
            num1 = num1 + 1;
            if (num1 % 3 == 0) {
                multiplode3(num1);
            } else if (num1 % 5 == 0) {
               multiplode5(num1);
            } else {
                System.out.println(num1);
            }

        }
    }

    static void multiplode3(int num) {
        if (num % 3 == 0) {
            System.out.println("Fizz");
        }

    }

    static void multiplode5(int num) {
        if (num % 5 == 0) {
            System.out.println("Buzz");
        }
    }

    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número");
        int num2 = sc.nextInt();
        cadenaNumeros(num1, num2);
    }
}
