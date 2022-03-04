import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {
    @Test
    public void es_multiplo_de_3(){
        Problema1 problema1 = new Problema1();

        boolean expected = true;
        boolean actual = problema1.multiplo3(problema1.cadenaNumeros());

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void es_multiplo_de_5(){
        Problema1 problema1 = new Problema1();

        boolean expected = false;
        boolean actual = problema1.multiplo5(problema1.cadenaNumeros());

        Assertions.assertEquals(actual, expected);
    }

}


