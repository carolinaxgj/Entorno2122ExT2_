public class Problema1 {
    static int cadenaNumeros() {
        int num = 0;
        for (int i = 0; i <= 20; i++) {
            num = num + 1;
            if (num % 3 == 0) {
                multiplode3(num);
            } else if (num % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(num);
            }

        }
        return num;
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

    public static void main(String[] args) {
        cadenaNumeros();
    }


}
