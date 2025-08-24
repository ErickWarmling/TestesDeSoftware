package CalculadoraIMC;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculadoraIMC {

    private static CalculadoraIMC calculadora = null;

    @BeforeClass
    public static void criarObjeto() {
        calculadora = new CalculadoraIMC();
    }

    @Test
    public void testAbaixoDoPeso() {
        String resultado = calculadora.calcularIMC(50, 1.75);
        assertEquals("Abaixo do peso", resultado);
    }

    @Test
    public void testPesoNormal() {
        String resultado = calculadora.calcularIMC(80, 1.80);
        assertEquals("Peso normal", resultado);
    }

    @Test
    public void testSobrepeso() {
        String resultado = calculadora.calcularIMC(85, 1.70);
        assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testObesidade() {
        String resultado = calculadora.calcularIMC(150, 1.60);
        assertEquals("Obesidade", resultado);
    }
}