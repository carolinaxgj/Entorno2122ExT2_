import java.util.Scanner;

public class Problema3 {
    static int cadenaNumeros(int num1, int num2) {

        for (int i = num1; i < num2; i++) {
            num1 = num1 + 1;
            if (num1 % 3 == 0) {
                multiplode3(num1);
            } else if (num1 % 5 == 0) {
               multiplode5(num1);
            } else if (num1 % 7 == 0){
                multiplode7(num1);
            } else if (num1 % 11 == 0){
                multiplode11(num1);
            }
            else {
                System.out.print(num1);
            }

        }
        return 0;
    }

    static boolean multiplode7(int num) {
        if (num % 7 == 0) {
            System.out.print("Foo");
        }

        return true;
    }
    static boolean multiplode11(int num) {
        if (num % 11 == 0) {
            System.out.print("Boo");
        }
    return true;
    }
    static boolean multiplode3(int num) {
        if (num % 3 == 0) {
            System.out.print("Fizz");
        }
    return true;
    }

    static boolean multiplode5(int num) {
        if (num % 5 == 0) {
            System.out.print("Buzz");
        }
        return true;
    }


    static int pideNum (){
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;

    }
    public static void main(String[] args) {
        int num1 = pideNum();
        int num2 = pideNum();
        cadenaNumeros(num1, num2);
    }
}
