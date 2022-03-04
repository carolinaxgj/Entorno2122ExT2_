public class Problema1 {
    static int cadenaNumeros() {
        int num = 0;
        for (int i = 0; i <= 20; i++) {
            num = num + 1;
            if (num % 3 == 0) {
                multiplode3(num);
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }

        }
        return num;
    }

    static String multiplode3(int num) {
        if (num % 3 == 0) {
            System.out.println("Fizz");
        }
        return null;
    }

    public static void main(String[] args) {
        cadenaNumeros();
    }

    public boolean multiplo ( int num){
        return num % 3 ==0;
    }
}
