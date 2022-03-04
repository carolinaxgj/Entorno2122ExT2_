import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema3 {
    @Test
    public void es_multiplo_de_3(){
        Problema1 problema1 = new Problema1();

        boolean expected = true;
        boolean actual = problema1.multiplode3(problema1.cadenaNumeros());

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void es_multiplo_de_5(){
        Problema1 problema1 = new Problema1();

        boolean expected = false;
        boolean actual = problema1.multiplode5(problema1.cadenaNumeros());

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void cualquierRango(){
        Problema2 problema2 = new Problema2();

        int num1 = 4;
        int num2 = 10;

        int expected = num1;
        int expected2 = num2;

    }

    @Test
    public void es_multiplo_de_7(){
        Problema3 problema3 = new Problema3();

        int num1 = 3;
        int num2 = 20;

        boolean expected = true;
        boolean actual = problema3.multiplode7(problema3.cadenaNumeros(num1, num2));

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void es_multiplo_de_11(){
        Problema3 problema3 = new Problema3();

        int num1 = 3;
        int num2 = 20;

        boolean expected = true;
        boolean actual = problema3.multiplode11(problema3.cadenaNumeros(num1, num2));

        Assertions.assertEquals(actual, expected);
    }
}


