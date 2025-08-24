package Retangulo;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRetangulo {

    private static Retangulo r = null;

    @BeforeClass
    public static void criarObjeto() {
        r = new Retangulo(5, 2);
    }

    @Test
    public void testGetArea() {
        double retornoObtido = r.getArea();
        assertEquals(10.0, retornoObtido, 0.1);
    }

    @Test
    public void testGetPerimetro() {
        double retornoObtido = r.getPerimetro();
        assertEquals(14.0, retornoObtido, 0.1);
    }
}
