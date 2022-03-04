import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {
    @Test
    public void es_multiplo_de_3(){
        Problema1 problema1 = new Problema1();

        boolean expected = true;
        boolean actual = problema1.multiplo(problema1.cadenaNumeros());

        Assertions.assertEquals(actual, expected);
    }

}


