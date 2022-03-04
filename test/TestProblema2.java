import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema2 {
    @Test
    public void es_multiplo_de_3(){
        Problema1 problema1 = new Problema1();

        int num = (3);
        problema1.cadenaNumeros();
        String expected = "Fizz";
        String actual = problema1.multiplode3(num);

        Assertions.assertEquals(actual, expected);


    }
    @Test
    public void cualquierNumero (){
        Problema2 problema2 = new Problema2();

        problema2.cadenaNumeros(3,20);




    }
}


