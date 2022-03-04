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

    static String multiplode3(int num) {
        if (num % 3 == 0) {
            System.out.print("Fizz");
        }
        return null;
    }

    public static void main(String[] args) {
        cadenaNumeros();
    }

    public boolean multiplo3 ( int num){
        return num % 3 ==0;
    }

    public boolean multiplo5 (int num){
        return  num % 5 ==0;
    }
}
