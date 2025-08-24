package Media;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMedia {

    private static Media media = null;

    @BeforeClass
    public static void criarObjeto() {
        media = new Media();
    }

    @Test
    public void testMediaSimples() {
        double[] notas = {10.0, 8.5, 9.0};
        double resultado = media.calcularMedia(notas);
        assertEquals(9.1, resultado, 0.1);
    }

    @Test
    public void testMediaSimplesUmElemento() {
        double[] notas = {8.0};
        double resultado = media.calcularMedia(notas);
        assertEquals(8.0, resultado, 0.1);
    }

    @Test
    public void testMediaPonderada() {
        double[] notas = {10.0, 8.5, 9.3};
        double[] pesos = {5.0, 4.0, 1.0};
        double resultado = media.calcularMediaPonderada(notas, pesos);
        assertEquals(9.33, resultado, 0.1);
    }

    @Test
    public void testMediaPonderadaValoresIguais() {
        double[] notas = {10.0, 10.0};
        double[] pesos = {5.0, 5.0};
        double resultado = media.calcularMediaPonderada(notas, pesos);
        assertEquals(10.0, resultado, 0.1);
    }
}